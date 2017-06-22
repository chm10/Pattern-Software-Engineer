/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.unifei.sample.mediador;

/**
 *
 * @author MAEKAWA
 */
public abstract class Colaborador {
    private Mediador mediador;
    public void chamaOperacao (){
        mediador.operacaoMediada();
    }

    public Mediador getMediador() {
        return mediador;
    }

    public void setMediador(Mediador mediador) {
        this.mediador = mediador;
    }
    
}
