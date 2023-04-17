/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio4guia9.Service;

import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author Luis
 */
public class FechaService {
    Scanner leer = new Scanner(System.in);
    public Date fechaNacimiento(){
        System.out.println("Ingrese el dia de su nacimento :");
        int dia = leer.nextInt();
        System.out.println("Ingrese el año de su nacimiento :");
        int anio = leer.nextInt();
        System.out.println("Ingrese el mes de nacimiento :");
        int mes = leer.nextInt();
        return new Date(anio-1900,mes-1,dia);
    }
    
    public Date fechaActual(){
        Date fechaActual = new  Date();
        return fechaActual;
    }
    
    public int diferencia(Date nacimiento, Date actual){
     
        int edad = actual.getYear() - nacimiento.getYear();
        
        return edad;
    }
}
    
    
    
