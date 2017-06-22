/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.unifei.sample.template.method2;

/**
 *
 * @author MAEKAWA
 */
public abstract class Aplicacao {
    public void executar (){
        inicializar();
        tarefa();
    }
    protected abstract void inicializar ();
    protected abstract void tarefa ();
}
