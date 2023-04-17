/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio2guia9.Service;

import ejercicio2guia9.Entidades.ParDeNumeros;

/**
 *
 * @author Luis
 */

  public class ParDeNumerosService {
    ParDeNumeros cuenta1= new ParDeNumeros();
    
    public void mostrarValores(){
        System.out.println(cuenta1.toString());
    }
    public void devolverMayor(){
        if (cuenta1.getNum1()>cuenta1.getNum2()){
            System.out.println(cuenta1.getNum1()+" es mayor a "+cuenta1.getNum2());
        }else if(cuenta1.getNum1()<cuenta1.getNum2()){
             System.out.println(cuenta1.getNum1()+" es menor a "+cuenta1.getNum2());
        }else{
            System.out.println("Son iguales");
        }
        
    }
    public void calcularPotencia(){
         if (cuenta1.getNum1()>cuenta1.getNum2()){
            System.out.println(Math.pow(Math.round(cuenta1.getNum1()),Math.round(cuenta1.getNum2())));
        }else{
             System.out.println(Math.pow(Math.round(cuenta1.getNum2()),Math.round(cuenta1.getNum1())));
       
    }
}
     public void raizCuadrada(){
        if (cuenta1.getNum1()>cuenta1.getNum2()){
            System.out.println(Math.sqrt(Math.abs(cuenta1.getNum2())));
        }else{
             System.out.println(Math.sqrt(Math.abs(cuenta1.getNum1())));
        }
}  
  }
