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
public class PagarAtrasado implements Comando{
    Boleto b = null;
    public PagarAtrasado(Boleto b) {
        this.b = b;
    }
   
    @Override
    public void executar() {
        b.pagarEmAtraso();
    }
    
}
