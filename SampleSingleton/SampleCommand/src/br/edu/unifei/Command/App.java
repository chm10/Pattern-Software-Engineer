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
public class App {
    public static void main(String[] args) {
        Interruptor i = new Interruptor();
        Luz l = new Luz ();
        ComandoLigar cl = new ComandoLigar(l);
        i.addComando(cl);
        ComandoDesligar c2 = new ComandoDesligar(l);
        i.addComando(c2);
        for (Comando c : i.getComandos()) {
            c.executar();
        }
    }
}
