/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio3guia9.ArregloService;

import java.util.Arrays;

/**
 *
 * @author Luis
 */

        
     public class ArregloService {

    public static void inicializarA(double[] v1) {
        for (int i = 0; i < v1.length; i++) {
            v1[i] = Math.random() * 10 + 1;
        }
    }

    public static void mostrar(double[] v1) {
        System.out.println(Arrays.toString(v1));
    }

    public static void ordenar(double[] v1) {
        Arrays.sort(v1);
        System.out.println(Arrays.toString(v1));
        double vord[] = new double[v1.length];
        for (int i = 0; i < v1.length; i++) {
            vord[i] = v1[v1.length - 1 - i];

        }
        System.out.println(Arrays.toString(vord));
    }

    public static void incializarB(double[] v1, double[] v2) {
        for (int i = 0; i < 10; i++) {
            v2[i] = v1[i];
        }
        Arrays.fill(v2,v2.length-10,v2.length-1,0.5);
        System.out.println("");

    }
    }
    

