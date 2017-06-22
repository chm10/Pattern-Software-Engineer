/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.unifei.sample.builder.app;

import br.edu.unifei.sample.builder.Cama;
import br.edu.unifei.sample.builder.GuardaRoupa;
import br.edu.unifei.sample.builder.Quarto;

/**
 *
 * @author MAEKAWA
 */
public class App {

    public static void main(String[] args) {
        GuardaRoupa guardaRoupa;
        Cama cama;
        Quarto quarto = new Quarto();
        if (quarto.getMovel(0) instanceof Cama) {
           cama = (Cama) quarto.getMovel(0);
           cama.setTipo(2);
            
        }
        else {
            guardaRoupa = (GuardaRoupa) quarto.getMovel(0); 
            guardaRoupa.setPorta(3);
        }
quarto.getMovel(0).setMaterial("madeira");
    quarto.showQuarto();
    }
}
