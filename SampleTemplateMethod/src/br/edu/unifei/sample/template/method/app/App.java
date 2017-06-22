/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.unifei.sample.template.method.app;

import br.edu.unifei.sample.template.method.Artenazato;
import br.edu.unifei.sample.template.method.Componente;

/**
 *
 * @author MAEKAWA
 */
public class App {

    public static void main(String[] args) {
        Artenazato quadroDePintura = new Artenazato();
        quadroDePintura.setNome("Quadro de Tulipas");
        Componente pinceis = new Componente();
        pinceis.setPrecoCompra(30.00);
        Componente tinta = new Componente();
        tinta.setPrecoCompra(50.00);
        quadroDePintura.getComp().add(tinta);
        quadroDePintura.getComp().add(pinceis);
        System.out.println("Lucro:" + quadroDePintura.lucro());
        System.out.println("Venda:" + quadroDePintura.custo());
        System.out.println("Custo de producao:" + quadroDePintura.venda());
    }
}
