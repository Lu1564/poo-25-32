/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio6guia9.Service;

import ejercicio6guia9.Entidad.Curso;

import java.util.Scanner;

/**
 *
 * @author Luis
 */
public class CursoService {
  
    Scanner leer = new Scanner(System.in);
    
    
    public Curso crearCurso(){
        
        System.out.println("Ingrese el nombre del curso ");
        String nombre = leer.next();
        System.out.println("La cantidad de horas por dias que los dicta :");
        int horas = leer.nextInt();
        System.out.println("Dias por semana");
        int dias = leer.nextInt();
        System.out.println("En que turno : mañana o tarde :");
        String turno = leer.next();
        System.out.println("Cuanto cobra la hora");
        int precio = leer.nextInt();
        String [] alumnos = cargarAlumnos();

        return new Curso(nombre, horas, dias, turno, precio, alumnos);
    }
    
    public String[] cargarAlumnos(){
      String alumnos []= new String [5];
        for (int i = 0; i < 5; i++) {
            System.out.println("Ingrese el nombre del " + (i+1)+" alumno :");  
            alumnos[i]= leer.next();
        }
       
        return alumnos; 
        
    } 
    
    public int calcualarGanacia(Curso p1){
        
        
     return p1.getCantDeHorasPorDia()*p1.getPrecioPorHora()*p1.getAlumnos().length*p1.getCantidadDiasPorSemana();
    }
    
    
}


/*

Método cargarAlumnos(): este método le permitirá al usuario ingresar los alumnos 
que asisten a las clases. Nosotros nos encargaremos de almacenar esta información 
en un arreglo e iterar con un bucle, solicitando en cada repetición que se ingrese
el nombre de cada alumno.
Método crearCurso(): el método crear curso, le pide los valores de los atributos al
usuario y después se le asignan a sus respectivos atributos para llenar el objeto Curso.
En este método invocamos al método cargarAlumnos() para asignarle valor al atributo alumnos
Método calcularGananciaSemanal(): este método se encarga de calcular la ganancia en una 
semana por curso. Para ello, se deben multiplicar la cantidad de horas por día, el precio
por hora,  la cantidad de alumnosy la cantidad de días a la semana que se repite el encuentro.


*/