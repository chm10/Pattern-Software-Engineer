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
public class Inss implements Encargo {
    private double valorINSS;

    public double getValorINSS() {
        return valorINSS;
    }

    @Override
    public void atualizar(double val) {
        valorINSS = val * 0.03;
    }
    
}
