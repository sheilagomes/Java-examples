using System;
using System.Collections.Generic;

namespace Gradebook
{
    public class Book
    {
        public Book(string name)
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

        public void AddGrade(double nota)
        {
            if(nota <= 10 && nota >= 0)
            {
                grades.Add(nota);
            }
            else
            {
                throw new ArgumentException($"A {nameof(nota)} não é válida");
            }
        }

        public Stats GetStats()
        {
            var result = new Stats();
            result.Average = 0.0;
            result.High = double.MinValue;
            result.Low = double.MaxValue;
            
            
            for(var index = 0; index < grades.Count; index++)
            {
                result.High = Math.Max(grades[index], result.High);
                result.Low = Math.Min(grades[index], result.Low);
                result.Average += grades[index];
            };
            result.Average /= grades.Count;

            switch(result.Average)
            {
                case var d when d >= 9.0:
                    result.Letter = 'A';
                    break;

                case var d when d >= 8.0:
                    result.Letter = 'B';
                    break;
                
                case var d when d >= 7.0:
                    result.Letter = 'C';
                    break;
                
                case var d when d >= 6.0:
                    result.Letter = 'D';
                    break;
                
                default:
                    result.Letter = 'F';
                    break;
            }

            return result;
        }

        public List<double> grades;

        public string Name
        {
            get;
            set;
        }

        public const string CATEGORY = "Ciência";
    }
}