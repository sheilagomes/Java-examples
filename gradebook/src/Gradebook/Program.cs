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
            book.AddGrade(6.1);
            book.AddGrade(3.4);
            
            var stats = book.GetStats();
            Console.WriteLine($"A nota mais alta é {stats.High:N1}");
            Console.WriteLine($"A nota mais baixa é {stats.Low:N1}");
            Console.WriteLine($"A média final é {stats.Average:N1}");
        }
    }
}
