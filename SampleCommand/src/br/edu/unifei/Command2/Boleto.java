/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.unifei.Command2;

import java.util.Date;
import java.util.GregorianCalendar;

/**
 *
 * @author MAEKAWA
 */
public class Boleto {
    private Date vencimento;
    private int agencia;
    private int conta;
    private float valor;
    public float pagarEmAtraso (){
        return valor * 1.2f;
    }
    public float pagarSemAtraso (){
        return valor * 0.9f;
    }
}
