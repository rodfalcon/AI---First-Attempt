/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rna02;

/**
 *
 * @author lab6
 */
public class Perceptron {
    double w[][] = {{-0.5441}, {0.5562}, {-0.4074}};
    double x0[] = {-1, 2, 2};
    double x1[] = {-1, 4, 4};
    double funAtiva;
    double limiar = 0.0;
    double soma;
    int f; int y0 = 1; int y1 = 0;
    double taxa_aprendizado = 0.1;
    
    public void iteracao(){
        int n = 0;
        while (n<5){
            w = entrada0(w);
            for(int i =0; i < w.length; i++)
                System.out.println("pesos w = \t" + w[i][0]);
                System.out.println("valor de f = \t" + f);
            
            w = entrada1(w);
             for(int i =0; i < w.length; i++)
                System.out.println("pesos w = \t" + w[i][0]);
                System.out.println("valor de f = \t" + f);
                
                n = n+1;
                System.out.println("número de treinamentos" + n + "\n");
        }
    }

    private double[][] entrada0(double[][] w) {
        System.out.println("ENTRADA 0");
        this.w = w;
        soma = 0;
        for(int i = 0; i < x0.length; i++)
        soma += x0[i]*w[i][0];
        System.out.println("u0 = " + soma);
        
        if(soma > limiar)
            f = 1;
        else f = 0;
        for(int i = 0; i < x0.length; i++)
        {
            w[i][0] = w[i][0] + taxa_aprendizado*(y0-f)*x0[i];
        }
            return w;    
    }
    
    private double[][] entrada1(double[][] w) {
        System.out.println("ENTRADA 1");
        this.w = w;
        soma = 0;
        for(int i = 0; i < x1.length; i++)
        soma += x1[i]*w[i][0];
        System.out.println("u0 = " + soma);
        
        if(soma > limiar)
            f = 1;
        else f = 0;
        for(int i = 0; i < w.length; i++)
        {
            w[i][0] = w[i][0] + taxa_aprendizado*(y1-f)*x1[i];
        }
            return w;    
    }
    public void testaRede(double[][] w, double[] x0, double[] x1)
    {
        System.out.println("Teste da rede neural");
        this.w =w;
        x0 = this.x0;
        x1 = this.x1;
        
        for(int i = 0; i< w.length; i++)
        {
            System.out.println("pesos resultantes do treinamento ");
            System.out.println("w["+ i + "][0] =" + w[i][0]);
        }
        soma = 0;
        
        for(int i = 0; i < x0.length; i++)
            soma += x0[i]*w[i][0];
        if(soma > limiar)
            f =1;
        else f = 0;
        
        System.out.println("soma = " + soma);
        System.out.println("teste de entrada x1 saída y = " + f);
        
    }
}
