/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.unifei.sample.bridge;

/**
 *
 * @author MAEKAWA
 */
public class Nacional implements Imposto{

    @Override
    public float imposto(float p) {
        return p * 0.2f ;
    }
    
    
}
