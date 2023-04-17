/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1guia9;

import ejercicio1guia9.Entidad.Cadena;
import ejercicio1guia9.Entidad.Service.CadenaService;
import java.util.Scanner;

/**
 *
 * @author Luis
 */
public class Ejercicio1Guia9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        CadenaService f1 = new CadenaService();
        Cadena frase = f1.crearFrase();
        f1.mostrarVocales(frase);
        f1.invertirFrase(frase);
        System.out.println("Ingrese la letra a buscar ");
        String letra = leer.next();
        f1.vecesRepetido(frase, letra);
        System.out.println("Ingrese una nueva frase :");
        String frase2 = leer.next();
        f1.compararLongitud(frase, frase2);
        f1.unirFrases(frase, frase2);
        System.out.println("Ingrese un caracter para reemplazar la letra a");
        String caracter = leer.next();
        f1.reemplazar(frase, caracter);
        System.out.println("Ingrese una letra a buscar");
        String letra2 = leer.next();
        f1.contiene(frase, letra2);
        
    }
    
}

/*

Realizar una clase llamada Cadena, en el paquete de entidades, que tenga como atributos una frase (String)
y su longitud. Agregar constructor vacío y con atributo frase solamente. Agregar getters y setters. 
El constructor con frase como atributo debe setear la longitud de la frase de manera automática. 
Crear una clase CadenaServicio en el paquete servicios que implemente los siguientes métodos:
Método mostrarVocales(), deberá contabilizar la cantidad de vocales que tiene la frase ingresada.
Método invertirFrase(), deberá invertir la frase ingresada y mostrarla por pantalla.
Por ejemplo: Entrada: "casa blanca", Salida: "acnalb asac".
Método vecesRepetido(String letra), recibirá un carácter ingresado por el usuario y 
contabilizar cuántas veces se repite el carácter en la frase, por ejemplo:
Entrada: frase = "casa blanca". Salida: El carácter 'a' se repite 4 veces.
Método compararLongitud(String frase), deberá comparar la longitud de la frase
que compone la clase con otra nueva frase ingresada por el usuario.
Método unirFrases(String frase), deberá unir la frase contenida en la 
clase Cadena con una nueva frase ingresada por el usuario y mostrar la frase resultante.
Método reemplazar(String letra), deberá reemplazar todas las letras “a” que se encuentren 
en la frase, por algún otro carácter seleccionado por el usuario y mostrar la frase resultante.
Método contiene(String letra), deberá comprobar si la frase contiene una letra 
que ingresa el usuario y devuelve verdadero si la contiene y falso si no.


 */
