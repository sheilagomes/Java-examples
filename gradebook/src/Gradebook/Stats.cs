using System;

namespace Gradebook
{
    public class Stats
    {
        public double Average
        {
            get
            {
                return Sum / Count;
            }
        }
        public double High;
        public double Low;

        public char Letter
        {
            get
            {
                switch (Average)
                {
                    case var d when d >= 9.0:
                        return 'A';

                    case var d when d >= 8.0:
                        return 'B';

                    case var d when d >= 7.0:
                        return 'C';

                    case var d when d >= 6.0:
                        return 'D';

                    default:
                        return 'F';
                }
            }
        }

        public double Sum;
        public int Count;

        public void Add(double number)
        {
            Sum += number;
            Count += 1;
            High = Math.Max(number, High);
            Low = Math.Min(number, Low);
        }

        public Stats()
        {
            Count = 0;
            Sum = 0.0;
            High = double.MinValue;
            Low = double.MaxValue;
        }
    }
}