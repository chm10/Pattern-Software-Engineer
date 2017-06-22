/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.unifei.ChainOfReponsabilities;

import java.util.Scanner;

/**
 *
 * @author MAEKAWA
 */
public class App {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Cheque c = new Cheque();
        System.out.println("digite valor cheque:");
        c.setValor(in.nextInt());
        c.desconta();
        System.out.println("soma das notas: " + c.somaNotas());
        System.out.println("Numeros de notas:" +c.nNotas() );
    }
}
