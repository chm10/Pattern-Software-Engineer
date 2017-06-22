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
public class ColarBijuteria extends Colar{
    protected ColarBijuteria(){
        super();
    }
    private int tipoMaterial;

    public int getTipoMaterial() {
        return tipoMaterial;
    }

    public void setTipoMaterial(int tipoMaterial) {
        this.tipoMaterial = tipoMaterial;
    }
    
    
}
