/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package integradorjavaintroduccion.Service;

/**
 *
 * @author Luis
 */

import integradorjavaintroduccion.Entidad.Estudiantes;
import java.util.ArrayList;
import java.util.Scanner;

public class ServiceEstu {

    static Scanner leer = new Scanner(System.in).useDelimiter("\n");
    private double promedio;
    ArrayList<String> v1 = new ArrayList<>();

    public double getPromedio() {
        return promedio;
    }

    public void setPromedio(double promedio) {
        this.promedio = promedio;
    }

    public Estudiantes CrearEstud() {
        System.out.println("Ingrese el nombre del alumno");
        String nombre = leer.next();
        System.out.println("Ingrese la nota");
        int nota = leer.nextInt();
        while (nota < 0 || nota > 10) {
            System.out.println("Ingrese la nota correctamente");
            nota = leer.nextInt();
        }
        return new Estudiantes(nombre, nota);
    }

    public void Promedio(Estudiantes[] l1) {
        double d = 0;
        for (int i = 0; i < 8; i++) {
            d += l1[i].getNota();
        }
        this.promedio = d / 8;

    }

    public void alumnosDest(Estudiantes[] e1) {
        for (int i = 0; i < 8; i++) {
            if (e1[i].getNota() > promedio) {
                v1.add(e1[i].getNombre());
            }
        }
    }

    public void mostrarAD() {
        for (int i = 0; i < v1.size(); i++) {
            System.out.println("[" + v1.get(i) + "]");
        }
    }
}
