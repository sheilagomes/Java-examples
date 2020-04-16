namespace Collections
{
    class Country
    {
        public string Name { get; }
        public string Code { get; }
        public int Population { get; }

        public Country(string name, string code, int population)
        {
            Name = name;
            Code = code;
            Population = population;
        }   
    }
}