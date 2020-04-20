using System;
using System.Collections.Generic;
using System.IO;

namespace Tradu
{
    class Leitor
    {
        private string _caminhoArquivo;

        public Leitor(string caminhoArquivo)
        {
            _caminhoArquivo = caminhoArquivo;
        }

        public List<Frase> LerFrases()
        {
            var frase1 = new List<Frase>();

            using(StreamReader sr = new StreamReader(_caminhoArquivo))
            {
                string linha1;
                while((linha1 = sr.ReadLine()) != null)
                {
                    frase1.Add(LerLinha(linha1));

                }
            }
            
            return frase1;
        }

        public Frase LerLinha(string linha)
        {
            return new Frase(linha);
        }
    }
}