/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.unifei.sample.bridge;

/**
 *
 * @author MAEKAWA
 */
public class App {

    public static void main(String args[]) {
        Nacional n1 = new Nacional();
        Livro l1 = new Livro(n1);
        l1.setPreco(100);
        System.out.println("taxa liv nac=" + l1.taxaImposto());
        Importado i1 = new Importado();
        Revista r2 = new Revista(i1);
        r2.setPreco(10);
        System.out.println("taxa rev imp=" + r2.taxaImposto());
    }
}
