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
                return "(Desconhecido)";
            
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
		// Arredonda o número para a precisão especificada
		// Por exemplo, se a precisão for 10, arredondamos para o 10 mais próximo:
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
		// Retorna o número mais alto que é uma potência de 10 e não é maior que o número fornecido
		// Exemplos:
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