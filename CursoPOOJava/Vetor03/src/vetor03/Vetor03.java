/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vetor03;

import java.util.Arrays;

/**
 *
 * @author SEGM
 */
public class Vetor03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double v[]= {41, 2.5, 3.54, 7.6};
        Arrays.sort(v);
        for (double valor: v) {
            System.out.print(valor + " ");
        }
    }
    
}
