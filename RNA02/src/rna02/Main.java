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
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Perceptron perceptron = new Perceptron();
        perceptron.iteracao();
        perceptron.testaRede(perceptron.w, perceptron.x0, perceptron.x1);
    }
    
}
