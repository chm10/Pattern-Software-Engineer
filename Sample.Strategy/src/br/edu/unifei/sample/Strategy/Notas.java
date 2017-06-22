/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.unifei.sample.Strategy;

/**
 *
 * @author MAEKAWA
 */
public class Notas {
    private Estatistica est;
    private int[] conj = null;
    public Notas (int tam){
        conj = new int [tam];   
    }
    public int getEstatistica (int idx){
        if (conj.length<100)
            est =new Media();
        else if (conj.length<1000)
            est = new Variancia();
        else
            est = new DesvioPadrao();
        return est.calculo(conj);
    }
    public void setConj (int idx,int v){
        conj[idx] = v;
    }
}
