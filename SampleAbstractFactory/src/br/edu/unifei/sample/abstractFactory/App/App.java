/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.unifei.sample.abstractFactory.App;

import br.edu.unifei.sample.abstractFactory.JoalheiroBijuteria;
import br.edu.unifei.sample.abstractFactory.JoalheiroOuro;



/**
 *
 * @author MAEKAWA
 */
public class App {
    public static void main(String[] args) {
        JoalheiroBijuteria jBi = new JoalheiroBijuteria();
        System.out.println(jBi.novoAnel().getClass().getSimpleName());
        System.out.println(jBi.novoColar().getClass().getSimpleName());
        JoalheiroOuro jOu = new JoalheiroOuro();
        System.out.println(jOu.novoAnel().getClass().getSimpleName());
        System.out.println(jOu.novoColar().getClass().getSimpleName());
    }
}
