using System;
using IA_Teste.Negocio.Degrau;

namespace IA_Teste
{
    class Program
    {
        static void Main(string[] args)
        {
             Degrau teste = new Degrau();

             teste.verificaDegrau(teste.x1[0], teste.x2[0], teste.w1, teste.w2);
             teste.verificaDegrau(teste.x1[1], teste.x2[1], teste.w1, teste.w2);
             teste.verificaDegrau(teste.x1[2], teste.x2[2], teste.w1, teste.w2);
             teste.verificaDegrau(teste.x1[3], teste.x2[3], teste.w1, teste.w2);
        }
    }
}
