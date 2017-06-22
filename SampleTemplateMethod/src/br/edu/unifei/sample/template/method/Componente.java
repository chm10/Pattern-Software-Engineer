/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.unifei.sample.template.method;

/**
 *
 * @author MAEKAWA
 */
public class Componente extends Produto{
    private double precoCompra ;
    private double lucro;

    public double getPrecoCompra() {
        return precoCompra;
    }

    public void setPrecoCompra(double precoCompra) {
        this.precoCompra = precoCompra;
    }

    public double getLucro() {
        return lucro;
    }
    
    @Override
    public double custo() {
       return  precoCompra*1.3f ;
    }

    @Override
    public double venda() {
        return (precoCompra*1.3f);
    }
    
}
