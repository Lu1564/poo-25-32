/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemploscdu;

import java.util.Date;

/**
 *
 * @author Carolina Hernández
 */
public class ClaseDate {

    public static void main(String[] args) {

        System.out.println("Genera la fecha actual");
        Date fechaActual = new Date();

        System.out.println(fechaActual);

        System.out.println("------------------------------------------------------");
        System.out.println("Genera la fecha segun los valores en el constructor");
        Date fecha = new Date(100 , 10, 1); // Se le resta 1900 para que la fecha quede bien

        System.out.println(fecha);

        System.out.println("------------------------------------------------------");
        System.out.println("After: ");
        System.out.println("¿ La fecha está despues de la fecha actual ? " + fecha.after(fechaActual));

        System.out.println("------------------------------------------------------");
        System.out.println("Before: ");
        System.out.println("¿ La fecha está antes de la fecha actual ? " + fecha.before(fechaActual));

        System.out.println("------------------------------------------------------");
        System.out.println("CompareTo: ");
        System.out.println("La fecha 1990-10-1 comparado con la fecha actual"
                + " para saber si son iguales dio un resultado de " + fecha.compareTo(fechaActual));

        System.out.println("------------------------------------------------------");
        System.out.println("Equals: ");
        System.out.println("La fecha 1990-10-1 comparado con la fecha actual"
                + "/ Resultado: " + fecha.equals(fechaActual));

        System.out.println("------------------------------------------------------");
        System.out.println("Getters: ");
        System.out.println("El dia de la fecha actual es: " + fechaActual.getDate()
                + "\n el mes de la fecha actual es: " + fechaActual.getMonth()
                + "\n el año de la fecha actual es: " + (fechaActual.getYear()+1900));

        System.out.println("La fecha es: " + fechaActual.getTime());
        
        System.out.println("------------------------------------------------------");
        System.out.println("Setters: ");
        
        Date fechaNueva = new Date();
        
        fechaNueva.setDate(10); // Seteamos el dia
        fechaNueva.setMonth(5); // Seteamos el mes
        fechaNueva.setYear(2021); // Seteamos el anio
        
        System.out.println("------------------------------------------------------");
        System.out.println("ToString: ");
        
        String fechaCadena = fechaActual.toString();
        
        System.out.println("La fecha como cadena quedó: " + fechaCadena);

    }

}
