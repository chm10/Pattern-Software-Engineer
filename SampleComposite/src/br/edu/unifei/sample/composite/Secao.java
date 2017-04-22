/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.unifei.sample.composite;

/**
 *
 * @author MAEKAWA
 */
public class Secao extends Publicacao{
    
    public Secao(int n, String t) {
        super(n, t);
    }

    @Override
    public int totalPaginas() {
        return getNumPaginas();
    }
    
}
