/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.unifei.sample.observador;

/**
 *
 * @author MAEKAWA
 */
public class Pis implements Encargo{
    private double valorPis;
    @Override
    public void atualizar(double val) {
        valorPis = val * 0.1;
    }

    public double getValorPis() {
        return valorPis;
    }
    
}
