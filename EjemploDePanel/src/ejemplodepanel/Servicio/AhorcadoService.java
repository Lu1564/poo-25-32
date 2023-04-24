/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplodepanel.Servicio;

import ejemplodepanel.Entidad.Ahorcado;
import java.util.Arrays;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author Luis
 */
public class AhorcadoService {

    Ahorcado juego = new Ahorcado();
    Scanner leer = new Scanner(System.in);
    String[] palabra2;
   

    public void juego() {

        crearJuego();
        longitud();
        while (juego.getIntentos() > 0 && ((juego.getPalabra().length) - juego.getEncontradas()) > 0) {
            System.out.println("Ingrese una letra :");
            String letra = leer.next();
            buscar(letra);
            boolean resp= encontradas(letra);
            intentos(resp);
        }
        if (juego.getIntentos() == 0) {
            System.out.println("Has  perdido vuelve a intentarlo");

        } else {
            System.out.println("Has ganado");
        }
        /*
    Método juego(): el método juego se encargará de llamar todos los métodos
previamente mencionados e informará cuando el usuario descubra toda la palabra o se quede sin intentos.
         */
    }

    public void crearJuego() {
        
//        String palabra = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el dia"));
//        System.out.println(dia);
//        System.out.println("Ingrese la palabra para crear el juego:");
        String palabra = JOptionPane.showInputDialog("Ingrese la palabra para crear el juego:");
//        String palabra = leer.next();
//        System.out.println("Ingrese la cantidad de intentos que le dara al usuario");
        int intento = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de intentos que le dara al usuario"));
        juego.setIntentos(intento);
        String vector[] = new String[palabra.length()];
        for (int i = 0; i < palabra.length(); i++) {
            vector[i] = palabra.substring(i, i + 1);
        }
        palabra2 = new String[palabra.length()];
        Arrays.fill(palabra2, "_");
        juego.setPalabra(vector);
        System.out.println(Arrays.toString(vector));

        /*
        Metodo crearJuego(): le pide la palabra al usuario y cantidad de jugadas máxima.
Con la palabra del usuario, pone la longitud de la palabra, como la longitud del vector.
Después ingresa la palabra en el vector, letra por letra, quedando cada letra de la palabra
en un índice del vector. Y también, guarda la cantidad de jugadas máximas y el valor que ingresó el usuario.
         */
    }

    public void longitud() {
        System.out.print("La longitud de la palabra es : " + juego.getPalabra().length);
        String[] vector = new String[juego.getPalabra().length];
        Arrays.fill(vector, "_");
        System.out.println(" " + Arrays.toString(vector));
        /*
    Método longitud(): muestra la longitud de la palabra que se debe encontrar.
Nota: buscar como se usa el vector.length.
         */

    }

    public void buscar(String letra) {

        int cont = 0;
        for (String le : juego.getPalabra()) {
            if (le.contains(letra)) {
                cont++;
            }
            for (int i = 0; i < juego.getPalabra().length; i++) {
                if (letra.equalsIgnoreCase(juego.getPalabra()[i])) {
                    palabra2[i] = letra.toUpperCase();
                }
            }
        }
        if (cont >= 1) {
            System.out.println("La letra esta en la palabra" + Arrays.toString(palabra2));

        } else {
            System.out.println("La letra no se encuentra en la palabra" + Arrays.toString(palabra2));
        }
        /*
    Método buscar(letra):  este método recibe una letra dada por el usuario y
busca si la letra ingresada es parte de la palabra o no. También informará si la letra estaba o no.
         */
    }

    public boolean encontradas(String letra) {
        int cont = 0;
        int posi;
        for (String le : juego.getPalabra()) {
            if (le.contains(letra)) {
                cont++;
            }
        }
        juego.setEncontradas(juego.getEncontradas() + cont);
        System.out.println("Contiene: " + cont + " " + letra + ", restan encontrar " + ((juego.getPalabra().length) - juego.getEncontradas()) + " letras.");
        return cont > 0;
        /*
    Método encontradas(letra):  que reciba una letra ingresada por el usuario
y muestre cuantas letras han sido encontradas y cuántas le faltan.
Este método además deberá devolver true si la letra estaba y false si la letra no estaba, ya que,
cada vez que se busque una letra que no esté, se le restará uno a sus oportunidades.
         */
    }

    public void intentos(boolean letra) {
        if (letra) {
           juego.setIntentos(juego.getIntentos());
        System.out.println("Le quedan :" + juego.getIntentos() + " intentos para adivinar la palabra"); 
        }else{
        juego.setIntentos(juego.getIntentos() - 1);
        System.out.println("Le quedan :" + juego.getIntentos() + " intentos para adivinar la palabra");
        }
        /*
    Método intentos(): para mostrar cuántas oportunidades le queda al jugador.
         */
    }

}