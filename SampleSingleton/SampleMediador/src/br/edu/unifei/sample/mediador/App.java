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
public class App {

    public static void main(String[] args) {
        ColaboradorGato g = new ColaboradorGato();
        ColaboradorRato r = new ColaboradorRato();
        MediadorGatoRato m = new MediadorGatoRato();
        m.setGato(g);
        m.setRato(r);
        r.setMediador(m);
        g.setMediador(m);
        System.out.println("velocidade gato = " + g.getVelocidade());
        System.out.println("velocidade rato = " + r.getVelocidade());
        r.chamaOperacao();
        System.out.println("velocidade gato = " + g.getVelocidade());
        System.out.println("velocidade rato = " + r.getVelocidade());
        g.chamaOperacao();
        System.out.println("velocidade gato = " + g.getVelocidade());
        System.out.println("velocidade rato = " + r.getVelocidade());
    }
}
