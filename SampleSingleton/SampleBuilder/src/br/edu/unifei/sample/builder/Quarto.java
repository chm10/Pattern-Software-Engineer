package br.edu.unifei.sample.builder;

import java.util.ArrayList;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author MAEKAWA
 */
public class Quarto {

    private List<Movel> movel = new ArrayList<>();

    public Quarto() {
        movel.add(new Cama());
        movel.add(new GuardaRoupa());
    }

    public Movel getMovel(int id) {
        if (movel.size() > id) {
            return movel.get(id);
        } else {
            return null;
        }
    }

    public void showQuarto() {
        for (Movel movel1 : movel) {
            System.out.println(movel1.getClass().getSimpleName());
        }
    }
}
