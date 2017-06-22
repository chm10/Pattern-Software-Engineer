/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.unifei.sample.prototype;

/**
 *
 * @author MAEKAWA
 */
public class Gif <T extends Gif> extends Video {
    private int replay;
    @Override
    public Midia clone() {
        Gif gif = new Gif();
        gif.setTitulo("obama");
        gif.setDiretor("Obama");
        gif.setProdutora("Obama");
        gif.setReplay(10);
        return gif;
    }

    public int getReplay() {
        return replay;
    }

    public void setReplay(int replay) {
        this.replay = replay;
    }
    
}
