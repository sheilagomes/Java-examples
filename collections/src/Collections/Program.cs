using System;
using System.Collections.Generic;

namespace Collections
{
    class Program
    {
        static void Main(string[] args)
        {
            string filepath = @"/home/sheila/Downloads/Countries2015.csv";
            CsvReader reader = new CsvReader(filepath);
            Dictionary<string, Country> countries = reader.ReadAllCountries();

            Console.WriteLine("Qual código de páis você procura?");
            string userInput = Console.ReadLine();

            bool gotCountry = countries.TryGetValue(userInput, out Country country);
            if(!gotCountry)
                Console.WriteLine($"Desculpe, mas o código {userInput} não foi encontrado.");
            else
                Console.WriteLine($"A população de {country.Name} é de {PopulationFormatter.FormatPopulation(country.Population)}");
        }
    }
}
