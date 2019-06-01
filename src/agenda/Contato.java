/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agenda;

import java.util.*;
import javax.swing.*;
import javax.swing.event.*;

/**
 *
 * @author thiag
 */
public class Contato{
    String nome;
    String telefone;
    String detalhes;
    public void contato(String nome, String telefone, String detalhes){
        this.nome = nome;
        this.telefone = telefone;
        this.detalhes = detalhes;
    }
}
