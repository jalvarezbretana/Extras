/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package extras1_3;

import java.util.*;

/**
 *
 * @author jalvarezbretana
 */
public class Extras1_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        System.out.println("Dime o número de 3 cifras");
        int numero = sc.nextInt();
        int cifra1 = numero / 100;
        int calculo = numero - (cifra1 * 100);
        int cifra2 = calculo / 10;
        int cifra3 = calculo - (cifra2 * 10);
        System.out.println("A primeira cifra é " + cifra1 + ", a segunda é "
                + cifra2 + " e a terceira é " + cifra3);

    }

}
