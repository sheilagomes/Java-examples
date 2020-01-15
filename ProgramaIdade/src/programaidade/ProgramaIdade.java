/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programaidade;

import java.util.Scanner;
/**
 *
 * @author SEGM
 */
public class ProgramaIdade {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner t = new Scanner(System.in);
        System.out.println("Olá, em que você nasceu? ");    
        int nasc = t.nextInt();
        int i = 2020 - nasc;
        if (i>=18) {
            System.out.println("Maior de idade");
        } else {
            System.out.println("Menor de idade");
        }
    }
    
}
