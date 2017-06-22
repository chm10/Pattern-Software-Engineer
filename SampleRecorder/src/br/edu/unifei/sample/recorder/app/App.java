/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.unifei.sample.recorder.app;

import br.edu.unifei.sample.recorder.Cliente;

/**
 *
 * @author MAEKAWA
 */
public class App {

    public static void main(String[] args) {
        Cliente c = new Cliente();
        c.setLogradouro("Rua A");
        c.createEndereco();
        System.out.println(c.getLogradouro());
        c.setLogradouro("Rua B");
        c.createEndereco();
        System.out.println(c.getLogradouro());
        c.refazerEnd();
        System.out.println(c.getLogradouro());
        c.setLogradouro("Rua C");
        c.createEndereco();
        System.out.println(c.getLogradouro());
        c.desfazerEnd();
        c.desfazerEnd();
        System.out.println(c.getLogradouro());
    }
}
