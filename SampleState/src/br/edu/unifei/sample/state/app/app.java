/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.unifei.sample.state.app;

import br.edu.unifei.sample.state.Leite;

/**
 *
 * @author MAEKAWA
 */
public class app {

    public static void main(String[] args) {
        Leite l1 = new Leite();
        l1.setCusto(4.00);
        l1.setBacterias(0.3);
        System.out.println(l1.getEstado().getClass().getSimpleName());
        System.out.println("R$" + l1.getPreco());
        l1.setBacterias(0.5);
        System.out.println(l1.getEstado().getClass().getSimpleName());
        System.out.println("R$" + l1.getPreco());
        l1.setBacterias(1);
        System.out.println(l1.getEstado().getClass().getSimpleName());
        System.out.println("R$" + l1.getPreco());
    }
}
