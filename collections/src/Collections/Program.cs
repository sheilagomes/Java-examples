using System;

namespace Collections
{
    class Program
    {
        static void Main(string[] args)
        {
            string filepath = @"/home/sheila/Downloads/Countries2015.csv";
            CsvReader reader = new CsvReader(filepath);

            Country[] countries = reader.ReadFirstNCountries(10);

            foreach (Country country in countries)
            {
                Console.WriteLine($"{PopulationFormatter.FormatPopulation(country.Population).PadLeft(15)}: {country.Name}");
            }
        }
        // {
        //     string[] daysOfWeek = {
        //         "Segunda-feira",
        //         "Terça-feira",
        //         "Quarta-feira",
        //         "Quinta-feira",
        //         "Sxta-feira",
        //         "Sábado",
        //         "Domingo"
        //     };

        //     Console.WriteLine("Antes:");
        //     foreach (string day in daysOfWeek)
        //         Console.WriteLine(day);

        //     daysOfWeek[4] = "Sexta-feira";

        //     Console.WriteLine("\r\nDepois:");
        //     foreach (string day in daysOfWeek)
        //         Console.WriteLine(day);

        //     Console.WriteLine("Que dia você quer mostrar?");
        //     Console.Write("(Segunda-feira = 1, etc.) > ");
        //     int iDay = int.Parse(Console.ReadLine());

        //     string chosenDay = daysOfWeek[iDay-1];
        //     Console.WriteLine($"O dia é {chosenDay}");

            /* Mostrar os dias em ordem */
            // foreach (string day in daysOfWeek)
            //     Console.WriteLine(day);
    }
}
