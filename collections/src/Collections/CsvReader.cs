using System;
using System.Collections.Generic;
using System.IO;

namespace Collections
{
    class CsvReader
    {
        private string _csvFilePath;

        public CsvReader(string csvFilePath)
        {
            this._csvFilePath = csvFilePath;
        }

        public Dictionary<string, Country> ReadAllCountries()
        {
            var countries = new Dictionary<string, Country>();

            using(StreamReader sr = new StreamReader(_csvFilePath))
            {
                //Essa linha pulava o header, mas tive que comentar porque estava pulando a primeira linha, será que o header já é pulado automaticamente?
                //sr.ReadLine();

                string csvLine = sr.ReadLine();
                while((csvLine = sr.ReadLine()) != null)
                {
                    Country country = ReadCountryFromCsvLine(csvLine);
                    countries.Add(country.Code, country);
                }
            }
            
            return countries;
        }

        public Country ReadCountryFromCsvLine(string csvLine)
        {
            string[] parts = csvLine.Split(',');
            string name;
            string code;
            string poptext;

            switch (parts.Length)
            {
                case 3:
                    name = parts[0];
                    code = parts[1];
                    poptext = parts[2];
                    break;
                case 4:
                    name = parts[0] + "," + parts[1];
                    name = name.Replace("\"", null).Trim();
                    code = parts[2];
                    poptext = parts[3];
                    break;
                default:
                    throw new Exception($"Não é possível ler o país da linha: {csvLine}");
            }

            //TryParse atribui 0 à popText se o Parse não funcionar
            int.TryParse(poptext, out int population);
            return new Country(name, code, population);
        }
    }
}