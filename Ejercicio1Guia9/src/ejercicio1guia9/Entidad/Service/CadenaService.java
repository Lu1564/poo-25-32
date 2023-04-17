/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1guia9.Entidad.Service;

import ejercicio1guia9.Entidad.Cadena;
import java.util.Scanner;

/**
 *
 * @author Luis
 */
public class CadenaService {

    Scanner leer = new Scanner(System.in);

    public Cadena crearFrase() {

        System.out.println("Ingrese la frase a analizar:");
        String oracion = leer.nextLine();
        return new Cadena(oracion);

    }

    public void mostrarVocales(Cadena frase) {
        String fra = frase.getFrase();
        int cont = 0;
        for (int i = 0; i < fra.length(); i++) {
            if (fra.substring(i, (i + 1)).equalsIgnoreCase("a")
                    || fra.substring(i, (i + 1)).equalsIgnoreCase("e")
                    || fra.substring(i, (i + 1)).equalsIgnoreCase("i")
                    || fra.substring(i, (i + 1)).equalsIgnoreCase("o")
                    || fra.substring(i, (i + 1)).equalsIgnoreCase("u")) {

                cont++;
            }
        }
        System.out.println("La cantidad de vocales que hay en la frase es :" + cont);

        /*
        Método mostrarVocales(), deberá contabilizar la cantidad de vocales que tiene la frase ingresada.
         */
    }

    public void invertirFrase(Cadena frase) {

        String a="";
        for (int i = frase.getLongitud(); i > 0; i--) {
           
            a+=frase.getFrase().charAt(i);
        }
        System.out.println(a);
        /*
        Método invertirFrase(), deberá invertir la frase ingresada y mostrarla por pantalla.
Por ejemplo: Entrada: "casa blanca", Salida: "acnalb asac".
         */
    }

    public void vecesRepetido(Cadena frase, String letra) {
        
        int cont=0;
        for (int i = 0; i < frase.getLongitud(); i++) {
            if (frase.getFrase().substring(i, i+1).equalsIgnoreCase(letra)) {
                cont++;         
            }
        }
        System.out.println("La letra se encuentra " + cont + " veces en la frase");
        /*
        Método vecesRepetido(String letra), recibirá un carácter ingresado por el usuario y 
contabilizar cuántas veces se repite el carácter en la frase, por ejemplo:
Entrada: frase = "casa blanca". Salida: El carácter 'a' se repite 4 veces.
         */
    }

    public void compararLongitud(Cadena frase, String frase2) {
        
      
        int long2 = frase2.length();
        
        if (frase.getLongitud()==long2) {
            System.out.println("Las frases tienen la misma longitud");   
        }else {
            System.out.println("No tienen la misma longitud"); 
        }
        /*
        Método compararLongitud(String frase), deberá comparar la longitud de la frase
que compone la clase con otra nueva frase ingresada por el usuario.
         */
    }

    public void unirFrases(Cadena frase ,String frase2) {
        System.out.println(frase.getFrase()+ frase2);
        
        /*
        Método unirFrases(String frase), deberá unir la frase contenida en la 
clase Cadena con una nueva frase ingresada por el usuario y mostrar la frase resultante.
         */
    }

    public void reemplazar(Cadena frase, String caracter) {
        
       String a = frase.getFrase().replaceAll("a",caracter);
        System.out.println(a);
        /*
        Método reemplazar(String letra), deberá reemplazar todas las letras “a” que se encuentren 
en la frase, por algún otro carácter seleccionado por el usuario y mostrar la frase resultante.
         */
    }

    public void contiene(Cadena frase ,String letra) {
        boolean a = frase.getFrase().contains(letra);
        
        System.out.println("La frase contiene "+ letra + ": " + a );
        /*
        Método contiene(String letra), deberá comprobar si la frase contiene una letra 
que ingresa el usuario y devuelve verdadero si la contiene y falso si no.
         */
    }
    public static int contar(){
        
       return 4;
    }
}