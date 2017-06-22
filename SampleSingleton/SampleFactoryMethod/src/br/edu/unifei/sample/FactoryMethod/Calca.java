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
public class Calca extends Roupa{
    protected Calca (){
        super ();
    }
    private boolean frio;

    public boolean isFrio() {
        return frio;
    }

    public void setFrio(boolean frio) {
        this.frio = frio;
    }
    
}
