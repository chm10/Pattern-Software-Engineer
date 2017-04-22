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
public class Letra implements Caracter{
    private char letra;
    public void setSimbolo(char c){
        this.letra = c;
    }
    public char getSimbolo (){
        return letra;
    }
}
