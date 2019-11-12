/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package extras1_2;

import java.util.*;

/**
 *
 * @author jalvarezbretana
 */
public class Extras1_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);

        System.out.println("Cal é o radio do círculo?");

        double radio = sc.nextDouble(), area;
        area = Math.PI * Math.pow(radio, 2);

        System.out.println("Se o radio é " + radio + " o area do círculo é " + area);

    }

}
