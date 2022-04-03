/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex12;

import java.util.Scanner;

/**
 *
 * @author Gustavo.R
 */
public class Ex12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

       int numero = scanner.nextInt();

       if (numero > 80)

           System.out.println("O numero e maior que 80!");

       else if (numero < 25)

           System.out.println("O numero e menor que 25!");

       else if (numero == 40)

           System.out.println("O numero e igual a 40!");

       scanner.close();
    }
    
}
