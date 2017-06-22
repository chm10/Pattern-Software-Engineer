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
public class ComandoLigar implements Comando{
    private Luz luz = null;

    public ComandoLigar(Luz luz) {
         this.luz = luz;
    }
    
    @Override
    public void executar() {
        luz.ligar();
    }
    
}
