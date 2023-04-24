/*
Una escuela ha terminado su ciclo lectivo y todos sus alumnos ya rindieron el examen final. 
La escuela nos ha pedido que calculemos el promedio de notas final de todos sus alumnos
y saber quÃ© alumnos han recibido una nota por encima de ese promedio.

Para esto vamos a tener que crear un objeto de tipo Estudiante, 
sus atributos van a ser nombre y nota (representando la nota obtenida en el final). 
La escuela consta con tan solo 8 estudiantes, por lo que deberemos crear los 8 estudiantes con sus respectivas notas.

Una vez creado los estudiantes deberemos guardar los estudiantes en un arreglo 
de objetos tipo Estudiante, usando ese arreglo tenemos que realizar las dos tareas que nos ha pedido la escuela.

Calcular y mostrar el promedio de notas de todo el curso

Retornar otro arreglo con los nombre de los alumnos que recibieron una nota mayor al promedio del curso

Por Ãºltimo, deberemos mostrar todos los estudiantes con una nota mayor al promedio.

Nota: para crear un vector de objetos la definiciÃ³n es la siguiente:
Objeto nombreVector[] = new Objeto[];
*/
package integradorjavaintroduccion;

import integradorjavaintroduccion.Entidad.Estudiantes;
import integradorjavaintroduccion.Service.ServiceEstu;

/**
 *
 * @author Luis
 */
public class IntegradorJavaIntroduccion {

    /**
     * @param args the command line arguments
     */
     public static void main(String[] args) {
      ServiceEstu sc = new ServiceEstu();
      Estudiantes e1[] = new Estudiantes[8];  
        for (int i = 0; i < 8; i++) {
            e1[i] = sc.CrearEstud();
        }
        sc.Promedio(e1);
        System.out.println("promedio = " + sc.getPromedio());
        sc.alumnosDest(e1);
        System.out.println("se supone que mostramos los alumnos aca");
        sc.mostrarAD();
    }
    
}

    

