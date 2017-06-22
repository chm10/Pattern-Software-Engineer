/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.unifei.sample.proxy;

/**
 *
 * @author MAEKAWA
 */
public class Central implements Banco{
    private float dinheiro;
    @Override
    public boolean emprestimo(float v) {
        if (dinheiro >= v){
            dinheiro -= v;
            return true;
        }
        else{
            return false;
        }
    }

    public float getDinheiro() {
        return dinheiro;
    }

    public void setDinheiro(float dinheiro) {
        this.dinheiro = dinheiro;
    }
    
}
