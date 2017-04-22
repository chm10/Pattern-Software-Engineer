/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.unifei.sample.composite;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author MAEKAWA
 */
public class Capitulo extends Publicacao{
    public List<Publicacao> publicacoes = new ArrayList<>();
    public Capitulo(int n,String t){
        super(n, t);
    }

    @Override
    public int totalPaginas() {
        int totalPagina = getNumPaginas();
        for (Publicacao publicacao : publicacoes) {
            totalPagina += publicacao.getNumPaginas();
        }
        return totalPagina;
    }
    public boolean addPublicacao(Publicacao v){
         return publicacoes.add(v);
    }
    public Publicacao removePublicacao (int idx){
        return publicacoes.remove(idx);
    }
    public int sizeOfPublicacao(){
        return publicacoes.size();
    }
    public Iterator<Publicacao> iteratorPublicacao(){
        return publicacoes.iterator();
    }
    
}
