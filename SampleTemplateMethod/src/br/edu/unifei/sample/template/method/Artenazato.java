/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.unifei.sample.template.method;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author MAEKAWA
 */
public class Artenazato extends Produto{
    private String nome;
    private List<Componente>comp = new ArrayList <>();
    @Override
    public double custo() {
        double total = 0.0f;
        for (Componente componente : comp) {
            total += componente.custo();
        }
        return total;
    }

    @Override
    public double venda() {
        double total = 0.0f;
        for (Componente componente : comp) {
            total += componente.venda();
        }
        return total*1.3;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Componente> getComp() {
        return comp;
    }

    public void setComp(List<Componente> comp) {
        this.comp = comp;
    }
    
}
