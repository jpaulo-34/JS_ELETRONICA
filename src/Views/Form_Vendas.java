/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Views;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author 201816810
 */
public class Form_Vendas extends JPanel implements ActionListener {
    
    private JTextField field_pecasavulsas;
    private JTextField field_televisores;
    private JTextField field_geladeiras;
    private JTextField field_lavadoras;
    private JTextField field_aparelhodesom;
    private JButton botao_enviar;


    
    public Form_Vendas(){
        setLayout(new GridLayout(6,1));
        
        JLabel label_pecasavulsas = new JLabel("Peças Avulsas");
        add(label_pecasavulsas);
        
        field_pecasavulsas = new JTextField(20);
        add(field_pecasavulsas);
        
        JLabel label_televisores = new JLabel("Televisores");
        add(label_televisores);
        
        field_televisores = new JTextField(20);
        add(field_televisores);
        
        JLabel label_geladeiras = new JLabel("Geladeiras");
        add(label_geladeiras);
        
        field_geladeiras = new JTextField(20);
        add(field_geladeiras);
        
        JLabel label_lavadoras = new JLabel("Lavadoras");
        add(label_lavadoras);
        
        field_lavadoras = new JTextField(20);
        add(field_lavadoras);
        
        JLabel label_aparelhosdesom = new JLabel("Aparelhos de Som");
        add(label_aparelhosdesom);
        
        field_aparelhodesom = new JTextField(20);
        add(field_aparelhodesom);
        
        JButton botao_enviar = new JButton("Salvar");
        botao_enviar.addActionListener(this);
        add(botao_enviar);
        
        
        
    }
    @Override
    public void actionPerformed(ActionEvent ae) {
         int valor_pecasavulsas = Integer.parseInt(field_pecasavulsas.getText());
         int valor_televisores = Integer.parseInt(field_televisores.getText());
         int valor_geladeiras = Integer.parseInt(field_geladeiras.getText());
         int valor_lavadoras = Integer.parseInt(field_lavadoras.getText());
         int valor_aparelhosdesom = Integer.parseInt(field_aparelhodesom.getText());
         
         String armazem = "Peças Avulsas: "+valor_pecasavulsas+"\n"
                 +"Telvisores : "+valor_televisores+"\n"
                 +"Geladeiras: "+valor_geladeiras+"\n"
                 +"Lavadoras :"+valor_lavadoras+"\n"
                 +"Aparelhos de Som: "+valor_aparelhosdesom+"\n";
                 
         
        JOptionPane.showMessageDialog(null, armazem);
    }
    
}
