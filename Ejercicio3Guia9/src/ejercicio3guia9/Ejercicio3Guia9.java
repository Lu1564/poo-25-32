/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio3guia9;

import ejercicio3guia9.ArregloService.ArregloService;

/**
 *
 * @author Luis
 */
public class Ejercicio3Guia9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double vector1[] = new double[50];
        double vector2[] = new double[20];

        ArregloService.inicializarA(vector1);
        //a1.inicializarA(vector1,vector2);
        ArregloService.mostrar(vector1);
        ArregloService.mostrar(vector2);
        ArregloService.ordenar(vector1);

    }

}


