/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.unifei.sample.composite;

/**
 *
 * @author MAEKAWA
 */
public class App {

    public static void main(String args[]) {
        Capitulo c1 = new Capitulo(10, "OO");
        Capitulo c2 = new Capitulo(20, "Encapsulamento");
        c1.addPublicacao(c2);
        Secao s1 = new Secao(1, "Construtores");
        c2.addPublicacao(s1);
        Secao s2 = new Secao(2, "Visibilidade");
        c2.addPublicacao(s2);
        Capitulo c3 = new Capitulo(20, "Relacionamento");
        c1.addPublicacao(c3);
        Secao s3 = new Secao(3, "Associcacao");
        c3.addPublicacao(s3);
        System.out.println("pags= " + c1.totalPaginas() +"cap:2 " + c2.totalPaginas());
    }
}
