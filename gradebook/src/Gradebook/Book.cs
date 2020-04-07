using System;
using System.Collections.Generic;

namespace Gradebook
{
    class Book
    {
        public Book(string name)
        {
            grades = new List<double>();
            this.name = name;
        }

        public void AddGrade(double grade)
        {
            grades.Add(grade);
        }

        public void ShowStats()
        {
            var result = 0.0;
            var highGrade = double.MinValue;
            var lowGrade = double.MaxValue;

            foreach(var number in grades)
            {
                highGrade = Math.Max(number, highGrade);
                lowGrade = Math.Min(number, lowGrade);
                result += number;
            }
            result /= grades.Count;
            Console.WriteLine($"A nota mais alta é {highGrade:N1}");
            Console.WriteLine($"A nota mais baixa é {lowGrade:N1}");
            Console.WriteLine($"A média final é {result:N1}");
        }

        public List<double> grades;
        private string name;
    }
}