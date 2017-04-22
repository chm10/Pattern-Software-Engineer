/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.unifei.sample.bridge;

/**
 *
 * @author MAEKAWA
 */
public abstract class Publicacao {
    public String nome;
    public String autor;
    public Imposto imposto;
    public float preco;

    public Publicacao(Imposto imposto) {
        this.imposto = imposto;
    }
    float taxaImposto(){
        return imposto.imposto(preco);
    }
}
