/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplodepanel.Entidad;

/**
 *
 * @author Luis
 */
public class Ahorcado {
    
    private String [] palabra;
    private String [] palabra2;
    private int encontradas;
    private int intentos;

    public Ahorcado() {
    }

    public Ahorcado(String[] palabra, String[] palabra2, int encontradas, int intentos) {
        this.palabra = palabra;
        
        
        this.encontradas = encontradas;
        this.intentos = intentos;
    }

    public String[] getPalabra() {
        return palabra;
    }

    public void setPalabra(String[] palabra) {
        this.palabra = palabra;
    }

    public String[] getPalabra2() {
        return palabra2;
    }

    public void setPalabra2(String[] palabra2) {
        this.palabra2 = palabra2;
    }

    public int getEncontradas() {
        return encontradas;
    }

    public void setEncontradas(int encontradas) {
        this.encontradas = encontradas;
    }

    public int getIntentos() {
        return intentos;
    }

    public void setIntentos(int intentos) {
        this.intentos = intentos;
    }

    
}