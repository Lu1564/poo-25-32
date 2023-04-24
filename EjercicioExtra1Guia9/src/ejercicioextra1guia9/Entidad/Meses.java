/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioextra1guia9.Entidad;

import java.util.Scanner;

/**
 *
 * @author Luis
 */
public class Meses {

    private String[] meses = {"enero", "febrero", "marzo", "abril", "mayo", "junio", "julio", "agosto", "septiembre", "octubre", "noviembre", "diciembre"};
    private String mesSecreto = meses[(int) (Math.random() * 12)];
    Scanner leer = new Scanner(System.in);
    
    

    public Meses() {

    }

    public String[] getMeses() {
        return meses;
    }

    public void setMeses(String[] meses) {
        this.meses = meses;
    }

    public String getMesSecreto() {
        return mesSecreto;
    }

    public void setMesSecreto(String mesSecreto) {
        this.mesSecreto = mesSecreto;
    }

    public void adivinarMes() {

        String resp;
        System.out.print("Adivine el mes secreto. Introduzca el nombre del mes en minúsculas :");
        resp = leer.next();

        if (resp.equals(mesSecreto)) {
            System.out.println("Ha acertado el mes es " + mesSecreto);
        } else {
            do {
                System.out.print("No ha acertado. Intente adivinarlo introduciendo otro mes:");
                resp = leer.next();
            } while (!resp.equalsIgnoreCase(mesSecreto));
            System.out.println("Ha acertado el mes es " + mesSecreto);
        }

    }

}
