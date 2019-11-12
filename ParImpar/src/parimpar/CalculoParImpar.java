/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parimpar;

import java.util.Scanner;

/**
 *
 * @author jalvarezbretana
 */
public class CalculoParImpar {

    Scanner sc = new Scanner(System.in);
    int contador;
    int acumulador;
    int num;

    public void calcular() {

        System.out.println("Dame 10 números");
        while (contador < 10) {
            num = sc.nextInt();

            if (num % 2 == 0) {
                acumulador = acumulador + num;
                System.out.println(acumulador);

            } else {
                acumulador = acumulador * num;
                System.out.println(acumulador);
            }
            contador++;
        }
        System.out.println("El número final es " + acumulador);

    }
}
