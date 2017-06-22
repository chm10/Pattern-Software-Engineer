/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.unifei.sample.observador;

import java.util.List;

/**
 *
 * @author MAEKAWA
 */
public class Folha extends Trabalhista {
    private double salarioCont;
    public double getSalarioCont(){
        return salarioCont;
    }
    public void setSalarioCont(double salarioCont) {
        this.salarioCont = salarioCont;
        notificar(salarioCont);
    }

    public void addEncargo(Encargo encargo) {
        encargos.add(encargo);
    }
    
    
}
