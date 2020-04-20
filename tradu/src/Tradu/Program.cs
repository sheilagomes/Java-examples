using System;
using System.Collections.Generic;

namespace Tradu
{
    class Program
    {
        static void Main(string[] args)
        {
            string caminhoArquivo = @"/home/sheila/texto.txt";
            Leitor leitor = new Leitor(caminhoArquivo);
            List<Frase> frases = leitor.LerFrases();

            var frases2 = new List<Frase>();
            int contador = 1;

            var indicesContadores = new List<int>();

            for(int i = 0;i < frases.Count;i++)
            {
                if (frases[i].Linha == contador.ToString())
                {
                    indicesContadores.Add(i+1);
                    contador++;
                }
            }

            for(int i = 0;i < indicesContadores.Count;i++)
            {
                int numeroDeFrases = 0;
                if (i == indicesContadores.Count-1)
                    numeroDeFrases = frases.Count-indicesContadores[i];
                else
                    numeroDeFrases = indicesContadores[i+1]-indicesContadores[i]-1;

                bool saoIguais = true;
                
                if (numeroDeFrases == 1)
                {
                    frases2.Add(frases[indicesContadores[i]]);
                    continue;
                }

                for (int j = 0;j < numeroDeFrases/2;j++)
                {
                    if (frases[indicesContadores[i]+j].Linha != frases[indicesContadores[i]+numeroDeFrases/2+j].Linha)
                        saoIguais = false;
                }
                if (saoIguais)
                {
                    for(int j = 0;j < numeroDeFrases/2;j++)
                    {
                        frases2.Add(frases[indicesContadores[i]+j]);
                    }
                }
            }

            foreach (Frase frase in frases2)
            {
                System.Console.WriteLine(frase.Linha);
            }
        }
    }
}