/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Layout;

import java.awt.BorderLayout;

import javax.swing.JFrame;

/**
 *
 * @author 201816810
 */
public class Janela extends JFrame {
    
    public static Centro centro = new Centro();
    
    public Janela(){
        
        super("Titulo");
        setLayout(new BorderLayout());
        add(new Topo(), BorderLayout.NORTH);
        add(centro, BorderLayout.CENTER);
        add(new Rodape(), BorderLayout.SOUTH);
        add(new Esquerda(),BorderLayout.WEST);
        add(new Direita(), BorderLayout.EAST);
        pack();
        show();
    }
}
          