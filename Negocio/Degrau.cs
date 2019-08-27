using System;

namespace IA_Teste.Negocio.Degrau
{
    public class Degrau
    {
        public double w1 = 1.0;
        public double w2 = 1.0;
        public double[] x1 = {0.0, 0.0, 1.0, 1.0};
        public double[] x2 = {0.0, 1.0, 0.0, 1.0};
        public double funcAtivacao;
        public double limiar = 1.5;
        int y;
        double y1;

        public void degrau(){
             int n = 0;
             while(n < 2)
             {
                 for(int i = 0; i <= 3; i++)
                 {
                     y1 = calculaAtivacao(x1[i], x2[i], w1, w2);
                     if(y1 > limiar)
                     y = 1;
                     else
                     y=0;
                 }
                 n = n+1;
             }

        }
        public double calculaAtivacao(double x1, double x2, double peso1, double peso2)
        {
            funcAtivacao = x1*peso1 + x2*peso2;
            return funcAtivacao;
        }
        public void verificaDegrau(double x1, double x2, double peso1, double peso2)
        {
            double saida = x1*peso1 + x2*peso2;
            if(saida > limiar)
            y = 1;
            else 
            y = 0;
            Console.WriteLine("PORTA E: F = (X1 ="+ x1 +") E: (X2 ="+ x2 + ") = "+ y);
        }
    }
}