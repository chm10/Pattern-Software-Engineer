/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.unifei.sample.flyweight;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author MAEKAWA
 */
public class Alfabeto {

    private List<Caracter> caracteres = new ArrayList<>();

    public Caracter getCaracter(char c) {
        Caracter caract = null;
        char low = Character.toLowerCase(c);
        if ((low >= 'a') && (low <= 'z')) {
            Iterator<Caracter> it = iteratorCaracter();
            while (it.hasNext()) {
                Caracter ca = it.next();
                if (ca.getSimbolo() == c) {
                    caract = ca;
                    break;
                }
            }
            if (caract == null) {
                Letra l = new Letra();
                l.setSimbolo(c);
                caracteres.add(l);
                caract = l;
            }
        } else {
            Pontuacao p = new Pontuacao();
            p.setSimbolo(c);
            caracteres.add(p);
            caract = p;
        }
        return caract;
    }

    public Iterator iteratorCaracter() {
        return caracteres.iterator();
    }

    public int sizeOfCaracter() {
        return caracteres.size();
    }
}
