using System;

namespace Gradebook
{
    class Program
    {
        static void Main(string[] args)
        {
            var numbers = new double[3];
            numbers[0] = 1.3;
            numbers[1] = 4.5;
            numbers[2] = 5.2;
            System.Console.WriteLine(numbers[0]+numbers[1]+numbers[2]);

            if(args.Length > 0) 
            {
                Console.WriteLine($"Olá, {args[0]}!");
            }
            else
            {
                Console.WriteLine("Olá!");
            }
        }
    }
}
