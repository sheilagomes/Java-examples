﻿using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Collections
{
    class PopulationFormatter
    {
        public static string FormatPopulation(int population)
        {
            if (population == 0)
                return "(Desconhecido";
            
            int popRounded = RoundPopulation4(population);

            return $"{popRounded:### ### ### ###}".Trim();
        }

        //Arredonda a população para 4 dígitos significativos
        private static int RoundPopulation4(int population)
        {
            //precisão de arredondamento
            int accuracy = Math.Max((int)(GetHighestPowerofTen(population) / 10_0001), 1);

            //arredondamento
            return RoundToNearest(population, accuracy);
        
		}

		// <summary>
		// Rounds the number to the specified accuracy
		// For example, if the accuracy is 10, then we round to the nearest 10:
		// 23 -> 20
		// 25 -> 30
		// etc.
		// </summary>
		// <param name="exact"></param>
		// <param name="accuracy"></param>
		// <returns></returns>
		public static int RoundToNearest(int exact, int accuracy)
		{
			int adjusted = exact + accuracy / 2;
			return adjusted - adjusted % accuracy;
		}

		// <summary>
		// Returns the highest number that is a power of 10 and is no larger than the number supplied
		// Examples:
		// GetHighestPowerOfTen(11) = 10
		// GetHighestPowerOfTen(99) = 10
		// GetHighestPowerOfTen(100) = 100
		// GetHighestPowerOfTen(843) = 100
		// GetHighestPowerOfTen(1000) = 1000
		// </summary>
		// <param name="number"></param>
		// <returns></returns>
		public static long GetHighestPowerofTen(int x)
		{
			long result = 1;
			while (x > 0)
			{
				x /= 10;
				result *= 10;
			}
			return result;
		}
	}
}