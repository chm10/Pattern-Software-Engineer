/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.unifei.Command2;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author MAEKAWA
 */
public class Log {
    List<Comando> cmds = new ArrayList<>();

    public List<Comando> getCmds() {
        return cmds;
    }

    public void setCmds(List<Comando> cmds) {
        this.cmds = cmds;
    }
    
}
