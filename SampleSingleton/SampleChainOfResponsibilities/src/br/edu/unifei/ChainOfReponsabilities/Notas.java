/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.unifei.ChainOfReponsabilities;

/**
 *
 * @author MAEKAWA
 */
public abstract class Notas {

    protected Notas prox;
    protected static int ultimaserie;
    protected int serie;

    public abstract int soma();
    public abstract int nNotas();
    public static Notas criarNotas(int v) {
        Notas cab = null;
        if ((int) v / 10 >= 1) {
            cab = new Nota10();
            v -= 10;
        } else if ((int) v / 5 >= 1) {
            cab = new Nota5();
            v -= 5;
        } else if ((int) v / 1 >= 1) {
            cab.prox = new Nota1();
            v -= 1;
        }
        Notas aux = cab;
        while (v > 0) {
            if ((int) v / 10 >= 1) {
                aux.prox = new Nota10();
                v -= 10;
            } else if ((int) v / 5 >= 1) {
                aux.prox = new Nota5();
                v -= 5;
            } else {
                aux.prox = new Nota1();
                v -= 1;
            }
            aux = aux.prox;
        }
        return cab;
    }
}
