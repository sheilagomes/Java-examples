using System;
using System.Collections.Generic;
using System.IO;

namespace Gradebook
{
    public delegate void GradeAddedDelegate(object sender, EventArgs args);

    public class NamedObject
    {
        public NamedObject(string name)
        {
            Name = name;
        }

        public string Name
        {
            get;
            set;
        }
    }

    public interface IBook
    {
        void AddGrade(double grade);
        Stats GetStats();
        string Name { get; }
        event GradeAddedDelegate GradeAdded;
    }

    public abstract class Book : NamedObject, IBook
    {
        public Book(string name) : base(name)
        {
        }

        public abstract event GradeAddedDelegate GradeAdded;
        public abstract void AddGrade(double grade);
        public abstract Stats GetStats();
    }
    public class DiskBook : Book
    {
        public DiskBook(string name) : base(name)
        {
        }

        public override event GradeAddedDelegate GradeAdded;

        public override void AddGrade(double grade)
        {
            using(var writer = File.AppendText($"{Name}.txt"))
            {
                writer.WriteLine(grade);
                if(GradeAdded != null)
                {
                    GradeAdded(this, new EventArgs());
                }
            }

        }

        public override Stats GetStats()
        {
            var result = new Stats();

            using(var reader = File.OpenText($"{Name}.txt"))
            {
                var line = reader.ReadLine();
                while(line != null)
                {
                    var number = double.Parse(line);
                    result.Add(number);
                    line = reader.ReadLine();
                }
            
            }

            return result;
        }
    }

    public class InMemoryBook : Book
    {
        public InMemoryBook(string name) : base(name)
        {
            grades = new List<double>();
            Name = name;
        }

        public void AddGrade(char letter)
        {
            switch(letter)
            {
                case 'A':
                    AddGrade(9);
                    break;
                
                case 'B':
                    AddGrade(8);
                    break;
                
                case 'C':
                    AddGrade(7);
                    break;
                
                default:
                    AddGrade(0);
                    break;
            }
        }

        public override void AddGrade(double nota)
        {
            if(nota <= 10 && nota >= 0)
            {
                grades.Add(nota);
                if(GradeAdded != null)
                {
                    GradeAdded(this, new EventArgs());
                }
            }
            else
            {
                throw new ArgumentException($"A {nameof(nota)} não é válida");
            }
        }

        public override event GradeAddedDelegate GradeAdded;

        public override Stats GetStats()
        {
            var result = new Stats();            
            
            for(var index = 0; index < grades.Count; index++)
            {
                result.Add(grades[index]);
            };

            return result;
        }

        private List<double> grades;

        public const string CATEGORY = "Ciência";
    }
}