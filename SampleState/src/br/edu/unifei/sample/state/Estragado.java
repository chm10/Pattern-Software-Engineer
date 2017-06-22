/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.unifei.sample.state;

/**
 *
 * @author MAEKAWA
 */
public class Estragado implements Estado {
    private double preco;
    public Estragado(double preco) {
        this.preco = preco;
    }
    @Override
    public double preco() {
        return 0.1*preco;
    }
    
}
