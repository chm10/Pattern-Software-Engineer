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
class ColaboradorRato extends Colaborador {

    private int velocidade = 0;

    public void FogeGato() {
        velocidade = velocidade + 6;
    }

    public int getVelocidade() {
        return velocidade;
    }
}
