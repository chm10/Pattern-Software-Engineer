/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.unifei.sample.recorder;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author MAEKAWA
 */
public class Historico {
    private List <Endereco> end = new ArrayList<>();
    public int size (){
        return end.size();
    }
    public void add (Endereco e){
        end.add(e);
    }
    public Endereco get (int id){
        return end.get(id);
    }
    public List <Endereco> getEnd() {
        return end;
    }

    public void setEnd(List <Endereco> end) {
        this.end = end;
    }
    
}
