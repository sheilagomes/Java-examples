using System;
using System.Collections.Generic;

namespace Gradebook
{
    class Program
    {
        static void Main(string[] args)
        {
            IBook book = new DiskBook("Notas da Sheila");
            // var book = new InMemoryBook("Notas da Sheila");
            book.GradeAdded += OnGradeAdded;

            EnterGrades(book);

            var stats = book.GetStats();

            Console.WriteLine($"Para o livro {book.Name}");
            Console.WriteLine($"A nota mais alta é {stats.High:N1}");
            Console.WriteLine($"A nota mais baixa é {stats.Low:N1}");
            Console.WriteLine($"A média final é {stats.Average:N1}");
            Console.WriteLine($"A letra da nota é {stats.Letter}");
        }

        private static void EnterGrades(IBook book)
        {
            while (true)
            {
                Console.WriteLine("Digite uma nota ou 'q' para sair: ");
                var input = Console.ReadLine();

                if (input == "q")
                {
                    break;
                }

                try
                {
                    var grade = double.Parse(input);
                    book.AddGrade(grade);
                }
                catch (ArgumentException ex)
                {
                    Console.WriteLine(ex.Message);
                }
                catch (FormatException ex)
                {
                    Console.WriteLine(ex.Message);
                }
                finally
                {
                    Console.WriteLine("**");
                }
            }
        }

        static void OnGradeAdded(object sender, EventArgs e)
        {
            Console.WriteLine("Uma nota foi adicionada");
        }
    }
}
