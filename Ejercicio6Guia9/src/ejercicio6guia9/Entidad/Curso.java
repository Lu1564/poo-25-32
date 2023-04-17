/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio6guia9.Entidad;

import java.util.Arrays;

/**
 *
 * @author Luis
 */
public class Curso {
    private String nombreCurso;
    private int cantDeHorasPorDia;
    private int cantidadDiasPorSemana;
    private String turno;
    private int precioPorHora;
    private String[] alumnos = new String[5];

    public Curso() {
    }
    
    

    public Curso(String nombreCurso, int cantDeHorasPorDia, int cantidadDiasPorSemana, String turno, int precioPorHora,String []alumnos) {
        this.nombreCurso = nombreCurso;
        this.cantDeHorasPorDia = cantDeHorasPorDia;
        this.cantidadDiasPorSemana = cantidadDiasPorSemana;
        this.turno = turno;
        this.precioPorHora = precioPorHora;
        this.alumnos=alumnos;
    }

    public String getNombreCurso() {
        return nombreCurso;
    }

    public void setNombreCurso(String nombreCurso) {
        this.nombreCurso = nombreCurso;
    }

    public int getCantDeHorasPorDia() {
        return cantDeHorasPorDia;
    }

    public void setCantDeHorasPorDia(int cantDeHorasPorDia) {
        this.cantDeHorasPorDia = cantDeHorasPorDia;
    }

    public int getCantidadDiasPorSemana() {
        return cantidadDiasPorSemana;
    }

    public void setCantidadDiasPorSemana(int cantidadDiasPorSemana) {
        this.cantidadDiasPorSemana = cantidadDiasPorSemana;
    }

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }

    public int getPrecioPorHora() {
        return precioPorHora;
    }

    public void setPrecioPorHora(int precioPorHora) {
        this.precioPorHora = precioPorHora;
    }

    public String[] getAlumnos() {
        return alumnos;
    }

    public void setAlumnos(String[] alumnos) {
        this.alumnos = alumnos;
    }

    @Override
    public String toString() {
        return "Curso{" + "nombreCurso=" + nombreCurso + ", cantDeHorasPorDia=" + cantDeHorasPorDia + ", cantidadDiasPorSemana=" + cantidadDiasPorSemana + ", turno=" + turno + ", precioPorHora=" + precioPorHora + ", alumnos=" + Arrays.toString(alumnos) + '}';
    }

 
}

/*

Para ello, crearemos una
clase entidad llamada Curso, cuyos atributos serán: nombreCurso, cantidadHorasPorDia
, cantidadDiasPorSemana, turno (mañana o tarde),  precioPorHora y alumnos. Donde alumnos 
es un arreglo de tipo String de dimensión 5 (cinco), donde se alojarán los nombres de 
cada alumno. A continuación, se implementarán los siguientes métodos:
Un constructor por defecto.
Un constructor con todos los atributos como parámetro.
Métodos getters y setters de cada atributo.
*/