/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.unifei.ChainOfReponsabilities;

/**
 *
 * @author MAEKAWA
 */
public class Cheque {
    private Notas notas = null;
    public int valor;
    public void desconta (){
        notas = Notas.criarNotas(valor);
    }
    public int somaNotas (){
        return notas.soma();
    }
    public int nNotas(){
        return notas.nNotas();
    }
    public Notas getNotas() {
        return notas;
    }

    public void setNotas(Notas notas) {
        this.notas = notas;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }
    
}
