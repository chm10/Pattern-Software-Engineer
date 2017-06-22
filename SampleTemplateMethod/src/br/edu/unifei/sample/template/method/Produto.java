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
public abstract class Produto {
    public double lucro (){
        return   venda () - custo ();
    }
    public abstract double custo ();
    public abstract double venda ();
    
}
