/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioextra2guia9;

import ejercicioextra2guia9.Service.AhorcadoService;

/**
 *
 * @author Luis
 */
public class EjercicioExtra2Guia9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        

        AhorcadoService jugador = new AhorcadoService();
        jugador.juego();

    }

}


/*
Juego Ahorcado: Crear una clase Ahorcado (como el juego), la cual deberá contener
como atributos, un vector con la palabra a buscar, la cantidad de letras encontradas
y la cantidad jugadas máximas que puede realizar el usuario.
Definir los siguientes métodos en AhorcadoService:



Método encontradas(letra):  que reciba una letra ingresada por el usuario
y muestre cuantas letras han sido encontradas y cuántas le faltan.
Este método además deberá devolver true si la letra estaba y false si la letra no estaba, ya que,
cada vez que se busque una letra que no esté, se le restará uno a sus oportunidades.
Método intentos(): para mostrar cuántas oportunidades le queda al jugador.
Método juego(): el método juego se encargará de llamar todos los métodos
previamente mencionados e informará cuando el usuario descubra toda la palabra o se quede sin intentos.
Este método se llamará en el main.

Un ejemplo de salida puede ser así:
Ingrese una letra:
a
Longitud de la palabra: 6
Mensaje: La letra pertenece a la palabra
Número de letras (encontradas, faltantes): (3,4)
Número de oportunidades restantes: 4
----------------------------------------------
Ingrese una letra:
z
Longitud de la palabra: 6
Mensaje: La letra no pertenece a la palabra
Número de letras (encontradas, faltantes): (3,4)
Número de oportunidades restantes: 3
---------------------------------------------
Ingrese una letra:
b
Longitud de la palabra: 6
Mensaje: La letra no pertenece a la palabra
Número de letras (encontradas, faltantes): (4,3)
Número de oportunidades restantes: 2
----------------------------------------------
Ingrese una letra:
u
Longitud de la palabra: 6
Mensaje: La letra no pertenece a la palabra
Número de letras (encontradas, faltantes): (4,3)
Número de oportunidades restantes: 1
----------------------------------------------
Ingrese una letra:
q
Longitud de la palabra: 6
Mensaje: La letra no pertenece a la palabra
Mensaje: Lo sentimos, no hay más oportunidades



 */
