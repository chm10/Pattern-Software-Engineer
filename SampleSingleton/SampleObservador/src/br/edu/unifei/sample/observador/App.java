/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.unifei.sample.observador;

/**
 *
 * @author MAEKAWA
 */
public class App {

    public static void main(String args[]) {
        Folha f = new Folha();
        Pis p = new Pis();
        f.addEncargo(p);
        Inss i = new Inss();
        f.addEncargo(i);
        f.setSalarioCont(1000);
        System.out.println("pis=" + p.getValorPis());
        System.out.println("inss=" + i.getValorINSS());
    }
}
