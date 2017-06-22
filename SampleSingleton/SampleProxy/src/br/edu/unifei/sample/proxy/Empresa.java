/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.unifei.sample.proxy;

/**
 *
 * @author MAEKAWA
 */
public class Empresa {
    private Banco banco;
    boolean pedirEmprestimo (float v){
        return banco.emprestimo(v);
    }

    public Banco getBanco() {
        return banco;
    }

    public void setBanco(Banco banco) {
        this.banco = banco;
    }
    
}
