/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.unifei.sample.FactoryMethod;

/**
 *
 * @author MAEKAWA
 */
public class Costureira implements Criador<Calca>{
    private String nome ;
    @Override
    public Calca fabricaRoupa() {
        return new Calca();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    
}
