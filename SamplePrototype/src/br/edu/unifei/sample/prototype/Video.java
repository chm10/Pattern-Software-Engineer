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
public  class Video <T extends Video> extends Midia{
    private String produtora;
    private String diretor;

    public String getProdutora() {
        return produtora;
    }

    public void setProdutora(String produtora) {
        this.produtora = produtora;
    }

    public String getDiretor() {
        return diretor;
    }

    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }

    @Override
    public Midia clone() {
        Video v = new Video ();
        v.setTitulo("oba");
        v.setDiretor("ola");
        v.setProdutora("obama");
        return v;
    }
    
}
