/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package extras1_1;

import java.util.*;

/**
 *
 * @author jalvarezbretana
 */
public class Extras1_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        System.out.println("Cantos productos mercaches?");
        int unidades = sc.nextInt();

        System.out.println("Cal é o precio de cada un?");
        float precio_u = sc.nextFloat();
        double precio_total = unidades * precio_u;

        System.out.println("Canto pagaches?");
        double recibo = sc.nextDouble();
        double devolucion = recibo - precio_total;

        System.out.println("\t ESTABLECIMIENTO \n Nº unidades = " + unidades
                + "\n Precio unidade = " + precio_u + "€" + "\n Total = " + precio_total + "€"
                + "\n Recibo = " + recibo + "€" + "\n Devolvo = " + devolucion + "€" + "\n Grazas por vir");

    }

}
