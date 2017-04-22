/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.unifei.sample.proxy;

/**
 *
 * @author MAEKAWA
 */
public class Brasil implements Banco {
    private Central central;
    @Override
    public boolean emprestimo(float v) {
        return central.emprestimo(v);
    }

    public Central getCentral() {
        return central;
    }

    public void setCentral(Central central) {
        this.central = central;
    }
    
}
