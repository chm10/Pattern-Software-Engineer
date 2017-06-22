/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.unifei.sample.flyweight;

/**
 *
 * @author MAEKAWA
 */
public class Posicao {

    private static Alfabeto alfabeto = new Alfabeto();;
    private  Caracter caracter;
    private int paragrafo;
    private int sentence;

    public Posicao(int paragrafo, int sentence, char caracter) {
        this.caracter = alfabeto.getCaracter(caracter);
        this.paragrafo = paragrafo;
        this.sentence = sentence;
    }

    public int getParagrafo() {
        return paragrafo;
    }

    public int getSentenca() {
        return sentence;
    }

    public static Alfabeto getAlfabeto() {
        return alfabeto;
    }
}
