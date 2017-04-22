/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.unifei.sample.flyweight;

import java.util.Iterator;

/**
 *
 * @author MAEKAWA
 */
public class App {

    public static void main(String args[]) {
        String hino = "Ouviram do Ipiranga as margens plácidas "
                + "Pátria amada, Brasil!";
        int i = 0;
        int par = 0;
        int sen = 0;
        Posicao pos[] = new Posicao[hino.length()];
        for (i = 0; i < hino.length(); i++) {
            char c = hino.charAt(i);
            pos[i] = new Posicao(par, sen, c);
            if (c == ' ') {
                sen++;
            }
            if (c == '.') {
                par++;
            }
        }
        System.out.println("total letras=" + hino.length());
        System.out.println("total simbolos=" + Posicao.getAlfabeto().sizeOfCaracter());
        System.out.println("IMPRIMIR SIMBOLOS");
        Iterator<Caracter> it1 = Posicao.getAlfabeto().iteratorCaracter();
        while (it1.hasNext()) {
            System.out.print("[" + it1.next().getSimbolo() + "]");
            i++;
            if (i % 10 == 0) {
                System.out.println();
            }
        }
    }
}
