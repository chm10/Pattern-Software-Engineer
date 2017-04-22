/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.unifei.sample.composite;

/**
 *
 * @author MAEKAWA
 */
public abstract class  Publicacao {
    private int numPaginas;
    private String titulo;
    public  Publicacao(int n ,String t){
        numPaginas = n;
        titulo = t;
    }

    public int getNumPaginas() {
        return numPaginas;
    }

    public void setNumPaginas(int numPaginas) {
        this.numPaginas = numPaginas;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public abstract int totalPaginas();
}
