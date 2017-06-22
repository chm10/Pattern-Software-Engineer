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
public class Camisa extends Roupa{
    protected Camisa(){
        super();
    }
    private boolean mangaCurta;

    public boolean isMangaCurta() {
        return mangaCurta;
    }

    public void setMangaCurta(boolean mangaCurta) {
        this.mangaCurta = mangaCurta;
    }
    
}
