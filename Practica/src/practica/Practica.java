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
        int size, numero;
        boolean comparador;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Cuantos numeros tendra su array?(10 max)");
            size = sc.nextInt();
        } while (size > 10);
        int numeros[] = new int[size];
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Introduzca numero");
            numero = sc.nextInt();
            comparador = false;
            comparador = buscarNumero(numeros, numero);
            if (comparador==false) {
                numeros[i] = numero;
            } else {
                System.out.println("ERROR: Numero repetido");
                i--;
            }
        }
        Arrays.sort(numeros);
        System.out.println("Sus numeros son");
        for (int i = 0; i < numeros.length; i++) {
            System.out.println(numeros[i]);
        }
    }

    public static boolean buscarNumero(int n[], int numero) {
        for (int i = 0; i < n.length; i++) {
            if (n[i] == numero) {
                return true;
            }
        }
            return false;
    }
}
