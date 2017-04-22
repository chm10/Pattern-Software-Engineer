/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.unifei.ChainOfReponsabilities;

/**
 *
 * @author MAEKAWA
 */
public class Nota5 extends Notas {

    public Nota5() {
        ultimaserie++;
        serie = ultimaserie;
    }

    @Override
    public int soma() {
        int soma = 5;
        if (prox != null) {
            soma += prox.soma();
        }
        return soma;
    }
    @Override
    public int nNotas() {
        int nNotas = 1;
        if (prox != null) {
            nNotas += prox.nNotas();
        }
        return nNotas;
    }
}
