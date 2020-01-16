/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vetor04;

import java.util.Arrays;

/**
 *
 * @author SEGM
 */
public class Vetor04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int vet[] = {8, 2, 3, 9, 54, 6, 1};
        for (int v:vet) {
            System.out.print(v);
        }
        System.out.println("");
        int p = Arrays.binarySearch(vet, 6);
        System.out.println("Encontrei o valor na posição " + p);
        }
    
}
