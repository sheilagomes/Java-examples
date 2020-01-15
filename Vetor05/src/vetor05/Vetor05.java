/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vetor05;

import java.util.Arrays;

/**
 *
 * @author SEGM
 */
public class Vetor05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] v = new int[20];
        Arrays.fill(v, 0);
        for (int c: v) {
            System.out.println(v[c]);
        }
    }
    
}
