/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.unifei.Command2;

import java.util.Date;
import java.util.Random;

/**
 *
 * @author MAEKAWA
 */
public class Cheque {
    private Date emissao;
    private int agencia;
    private int conta;
    private float valor;
    public boolean descontar (){
        return new Random().nextInt(100)<10;
    }
}
