/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.unifei.Command;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author MAEKAWA
 */
public class Interruptor {
    private List<Comando> comandos = new ArrayList<>();
    public void addComando(Comando cmd){
        cmd.executar();
    }

    public List<Comando> getComandos() {
        return comandos;
    }
    
}
