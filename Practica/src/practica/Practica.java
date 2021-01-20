/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica;

import java.util.*;

/**
 *
 * @author Traya
 */
public class Practica {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int size;
        boolean valsize;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Cuantos numeros tendra su array?(10 max)");
            size = sc.nextInt();
            valsize=fvalsize(size);
        } while (valsize==false);
        int numeros[] = new int[size];
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Introduzca numero");
            numeros[i] = sc.nextInt();
            for (int h = 0; h < i; h++) {
                if (numeros[h] == numeros[i]) {
                    System.out.println("ERROR: Numero repetido");
                    System.out.println("Anote un numero valido");
                    i--;
                }
            }
        }
        Arrays.sort(numeros);
        System.out.println("Sus numeros son");
        for (int i = 0; i < numeros.length; i++) {
            System.out.println(numeros[i]);
        }
    }

    public static boolean fvalsize(int size) {
        if (size<0 || size>10)
            return false;
        return true;
    }

}
