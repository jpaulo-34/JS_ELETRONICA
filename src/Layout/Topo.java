/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Layout;

import Views.Form_Orcamento;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JPanel;

/**
 *
 * @author 201816810
 */
public class Topo extends JPanel{
    private JButton Botao4;
    
    public Topo(){
          add(new Form_Orcamento());
          
    
}
}
