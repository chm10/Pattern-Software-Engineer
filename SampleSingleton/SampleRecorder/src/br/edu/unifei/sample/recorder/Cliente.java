/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.unifei.sample.recorder;

/**
 *
 * @author MAEKAWA
 */
public class Cliente {
    private String nome;
    private String logradouro;
    private Historico h = new Historico();
    private int pos = 0;

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }
    public void setRecordador (Endereco e){
        logradouro = e.getLogradouro();
    }
    public void createEndereco (){
        h.add(new Endereco(logradouro));
        pos++;
    }
    public boolean desfazerEnd(){
        if (pos  > 0 ){
            pos--;
            setRecordador(h.get(pos-1));
            return true;
        }
        else 
            return false;
    }
    public boolean refazerEnd (){
        if (pos < h.size()){
            pos++;
            setRecordador(h.get(pos-1));
            return true;
        }
        else 
            return false;
    }
}
