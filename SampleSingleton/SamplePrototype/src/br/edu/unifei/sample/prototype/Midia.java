/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.unifei.sample.prototype;

/**
 *
 * @author MAEKAWA
 * @param <T>
 */
public abstract class Midia <T extends Midia> {
    private String titulo;
    public abstract T clone ();

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    
}
