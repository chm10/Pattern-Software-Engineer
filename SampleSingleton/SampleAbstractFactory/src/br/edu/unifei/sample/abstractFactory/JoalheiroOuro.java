/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.unifei.sample.abstractFactory;

/**
 *
 * @author MAEKAWA
 */
public class JoalheiroOuro implements Joalheiro{

    @Override
    public Colar novoColar() {
        return new ColarOuro();
    }

    @Override
    public Anel novoAnel() {
        return new AnelOuro();
    }
    
}
