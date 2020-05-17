/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Layout;

import static Layout.Janela.centro;
import Views.Form_Clientes;
import Views.Form_Orcamento;
import Views.Form_Produtos;
import Views.Form_Tecnico;
import Views.Form_Vendas;
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
    
    public Topo(){
        
        setLayout(new GridLayout());
        
        JButton botao1 = new JButton("Clientes");
        JButton botao2 = new JButton("Orçamento");
        JButton botao3 = new JButton("Produtos");
        JButton botao4 = new JButton("Técnico");
        JButton botao5 = new JButton("Vendas");
        
        botao1.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                centro.removeAll();
                centro.add(new Form_Clientes());
                centro.repaint();
                centro.validate();
            }
        });
       
        botao2.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                centro.removeAll();
                centro.add(new Form_Orcamento());
                centro.repaint();
                centro.validate();
                
            }
        });
                        
        botao3.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                centro.removeAll();
                centro.add(new Form_Produtos());
                centro.repaint();
                centro.validate();      
            }
        });
        
        botao4.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                centro.removeAll();
                centro.add(new Form_Tecnico());
                centro.repaint();
                centro.validate(); 
            }
        });
        
        botao5.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                centro.removeAll();
                centro.add(new Form_Vendas());
                centro.repaint();
                centro.validate(); 
            }
        });
        
        add(botao1);
        add(botao2);
        add(botao3);
        add(botao4);
        add(botao5);
          
    
}
}
