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
public class Confeccao  implements Criador <Camisa>{
    private String modeloMaq;
    @Override
    public Camisa fabricaRoupa() {
        return new Camisa();
    }

    public String getModeloMaq() {
        return modeloMaq;
    }

    public void setModeloMaq(String modeloMaq) {
        this.modeloMaq = modeloMaq;
    }
    
}
