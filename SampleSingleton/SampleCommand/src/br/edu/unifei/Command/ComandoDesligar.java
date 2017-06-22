/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.unifei.Command;

/**
 *
 * @author MAEKAWA
 */
public class ComandoDesligar implements Comando{
    private Luz luz = null;

    public ComandoDesligar(Luz luz) {
         this.luz = luz;
    }
    @Override
    public void executar() {
        luz.desligar();
    }
    
}
