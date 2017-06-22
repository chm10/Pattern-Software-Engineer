/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.unifei.sample.FactoryMethod.App;

import br.edu.unifei.sample.FactoryMethod.Calca;
import br.edu.unifei.sample.FactoryMethod.Camisa;
import br.edu.unifei.sample.FactoryMethod.Confeccao;
import br.edu.unifei.sample.FactoryMethod.Costureira;



/**
 *
 * @author MAEKAWA
 */
public class App{
    public static void main(String[] args) {
        Confeccao con = new Confeccao();
        Costureira cos = new Costureira();
        Camisa c = con.fabricaRoupa();
        c.setMangaCurta(true);
        c.setTamanho(12);
        Camisa c2 = con.fabricaRoupa();
        c2.setMangaCurta(false);
        c2.setTamanho(16);
        System.out.println(c.isMangaCurta()?("Manga Curta ")+ c.getTamanho():("Manga Longa ") + c.getTamanho());
        System.out.println(c2.isMangaCurta()?("Manga Curta ")+ c.getTamanho():("Manga Longa ") + c2.getTamanho());
        Calca ca1 = cos.fabricaRoupa();
        ca1.setFrio(true);
        ca1.setTamanho(15);
        
    }
}
