/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.unifei.sample.flyweight;

/**
 *
 * @author MAEKAWA
 */
public class Pontuacao implements Caracter{
    private char pontuacao;
    @Override
    public void setSimbolo(char c) {
        this.pontuacao = c;
    }

    @Override
    public char getSimbolo() {
        return pontuacao;
    }
    
}
