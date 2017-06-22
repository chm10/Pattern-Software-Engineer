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
public class Bom implements Estado{
    private double gordura;
    private double preco;
    public Bom(double preco) {
        this.preco = preco;
    }
    
    @Override
    public double preco() {
        return 1.15f*preco;
    }
    

}
