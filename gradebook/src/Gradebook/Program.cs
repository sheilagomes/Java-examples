using System;
using System.Collections.Generic;

namespace Gradebook
{
    class Program
    {
        static void Main(string[] args)
        {
            var book = new Book("Notas da Sheila");
            
            while(true)
            {
                Console.WriteLine("Digite uma nota ou 'q' para sair: ");
                var input = Console.ReadLine();

                if(input == "q")
                {
                    break;
                }

                try
                {
                    var grade = double.Parse(input);
                    book.AddGrade(grade);
                }
                catch(ArgumentException ex)
                {
                    Console.WriteLine(ex.Message);
                }
                catch(FormatException ex)
                {
                    Console.WriteLine(ex.Message);
                }
                finally
                {
                    Console.WriteLine("**");
                }
            }           
            
            var stats = book.GetStats();

            Console.WriteLine(Book.CATEGORY);
            Console.WriteLine($"Para o livro {book.Name}");
            Console.WriteLine($"A nota mais alta é {stats.High:N1}");
            Console.WriteLine($"A nota mais baixa é {stats.Low:N1}");
            Console.WriteLine($"A média final é {stats.Average:N1}");
            Console.WriteLine($"A letra da nota é {stats.Letter}");
        }
    }
}
