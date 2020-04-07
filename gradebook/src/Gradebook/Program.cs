using System;
using System.Collections.Generic;

namespace Gradebook
{
    class Program
    {
        static void Main(string[] args)
        {
            var book = new Book("Notas da Sheila");
            book.AddGrade(8.9);
            
            var grades = new List<double>() { 1.3, 4.5, 5.2, 6.7 };
            grades.Add(7.1);
            grades.Add(3.8);
            grades.Add(7.9);

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
    }
}
