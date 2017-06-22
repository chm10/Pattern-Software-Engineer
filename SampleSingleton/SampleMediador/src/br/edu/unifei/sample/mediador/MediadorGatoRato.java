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
public class MediadorGatoRato implements Mediador {

    ColaboradorGato gato;
    ColaboradorRato rato;

    @Override
    public void operacaoMediada() {
        if (gato != null) {
            gato.PersegueRato();
        }
        if (rato != null) {
            rato.FogeGato();
        }
    }

    public ColaboradorGato getGato() {
        return gato;
    }

    public void setGato(ColaboradorGato gato) {
        this.gato = gato;
    }

    public ColaboradorRato getRato() {
        return rato;
    }

    public void setRato(ColaboradorRato rato) {
        this.rato = rato;
    }
    

}
