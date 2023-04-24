/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio5guia9.Service;

import ejercicio5guia9.Entidad.Persona;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author Luis
 */
public class PersonaService {

    Scanner leer = new Scanner(System.in);

    public Persona crearPersona() {

        System.out.println("Ingrese el nombre");
        String nombre = leer.next();
        System.out.println("Ingrese año ,mes y dia de nacimiento ");
        int anio = leer.nextInt();
        int mes = leer.nextInt();
        int dia = leer.nextInt();
        Date fecha = new Date(anio-1900, mes, dia);
        return new Persona(nombre, fecha);
    }
    
    public int calcularEdad(Date nacimiento, Date actual){
     
        int edad = actual.getYear() - nacimiento.getYear();
        
        if (actual.getMonth()<nacimiento.getMonth()) {
            edad=edad-1;   
        }
        System.out.println("Su edad es:" + edad);
        return edad;
    }
    
//    public static int calcularEdad(Persona p) {
//        int diferencia;
//        Date act = new Date();
//        diferencia = act.getYear() - p.getFechaNac().getYear();
//        if (act.getMonth() < p.getFechaNac().getMonth()) {
//            diferencia--;
//        } else if (act.getMonth() == p.getFechaNac().getMonth()) {
//            if (act.getDay() < p.getFechaNac().getDay()) {
//                diferencia--;
    
    public boolean menorQue (int edad){
        System.out.println("Ingrese una edad para comparar si es mayor o menor");
        int resp = leer.nextInt();
        
        return edad<resp ;
    }
    
    public void mostrarPersona(Persona p1){
        
        System.out.println(p1.toString());
        
    }

}

/*

Método crearPersona que pida al usuario Nombre y fecha de nacimiento de la persona a crear.
Retornar el objeto Persona creado.
Método calcularEdad que calcule la edad del usuario utilizando el atributo de fecha de
nacimiento y la fecha actual.
Método menorQue recibe como parámetro una Persona y una edad. Retorna true si la persona
es menor que la edad consultada o false en caso contrario.
Método mostrarPersona que muestra la información de la persona deseada.
*/
