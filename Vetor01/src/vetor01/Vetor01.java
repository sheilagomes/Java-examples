/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vetor01;

/**
 *
 * @author SEGM
 */
public class Vetor01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int n[]= {3,2,4,7,5}; //também pode ser int[] n
        System.out.println("O total de casas de n é " + n.length);
        for (int c = 0; c < 5; c++) {
            System.out.println("Na posição " + c + " o valor é " + n[c]);
        }
    }
    
}
