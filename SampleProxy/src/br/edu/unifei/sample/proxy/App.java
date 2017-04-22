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
public class App {

    public static void main(String[] args) {
        Central c = new Central();
        c.setDinheiro(100);
        Brasil b = new Brasil();
        b.setCentral(c);
        Empresa e = new Empresa();
        e.setBanco(b);
        e.pedirEmprestimo(50);
        System.out.println("saldo BC = " + c.getDinheiro());
    }
}
