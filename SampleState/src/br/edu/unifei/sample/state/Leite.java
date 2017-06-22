/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.unifei.sample.state;

/**
 *
 * @author MAEKAWA
 */
public class Leite {

    private double bacterias;
    protected double custo;
    private Estado estado = null;

    public void setBacterias(double v) {
        bacterias = v;
        if (v >= 0.6f) {
            estado = new Estragado(custo);
        } else if (v >= 0.4f && v < 0.6f) {
            estado = new Coalhado(custo);
        } else if (v < 0.4f) {
            estado = new Bom(custo);
        }
    }
    public Estado getEstado (){
        return estado;
    }
    public double getPreco(){
        return estado.preco();
    }

    public void setCusto(double custo) {
        this.custo = custo;
    }
    
}
