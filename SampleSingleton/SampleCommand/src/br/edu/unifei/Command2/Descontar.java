/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.unifei.Command2;

/**
 *
 * @author MAEKAWA
 */
public class Descontar implements Comando{
    private Cheque c;
    public Descontar (Cheque c){
        this.c = c;
    }

    @Override
    public void executar() {
        c.descontar();
    }
    
}
