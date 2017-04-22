/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.unifei.sample.singleton;

/**
 *
 * @author MAEKAWA
 */
public class ContadorGlobal {
    private ContadorGlobal (){}
    private static int numero = 1;
    private static ContadorGlobal contadorGlobal = new ContadorGlobal();
    public static ContadorGlobal getInstancia(){
        return contadorGlobal;
    }
    public static int incrementa(){
        return ++numero;
    }
    public static int getNumero (){
        return numero;
    }
    
}
