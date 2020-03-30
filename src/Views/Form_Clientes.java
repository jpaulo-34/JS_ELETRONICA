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
public class Form_Clientes extends JPanel implements ActionListener {
    
  private JTextField field_Nome ;
  private JTextField field_CPF;
  private JTextField field_RG;
  private JTextField field_telefone;
  private JTextField field_rua;
  private JTextField field_numerodacasa;
  private JTextField field_bairro;
  private JButton botao_enviar;
  
  public Form_Clientes(){
  
    setLayout(new GridLayout(8,1));
    
    JLabel label_nome = new JLabel("Nome");
    add(label_nome);
    
    field_Nome = new JTextField(20);
    add(field_Nome);
    
    JLabel label_CPF = new JLabel("CPF");
    add(label_CPF);
    
     field_CPF = new JTextField(20);
    add(field_CPF);
    
    JLabel label_RG = new JLabel ("RG");
    add(label_RG);
    
     field_RG = new JTextField (20);
    add(field_RG);
    
    JLabel label_telefone = new JLabel("Telefone");
    add(label_telefone);
    
     field_telefone = new JTextField(20);
    add(field_telefone);
    
    JLabel label_rua = new JLabel("Rua");
    add(label_rua);
    
     field_rua = new JTextField(20);
    add(field_rua);
    
    JLabel label_numerodacasa = new JLabel("Número da Casa");
    add(label_numerodacasa);
    
     field_numerodacasa = new JTextField(20);
    add(field_numerodacasa);
    
    JLabel label_bairro = new JLabel("Bairro");
    add(label_bairro);
    
     field_bairro = new JTextField(20);
    add(field_bairro);
   
    JButton botao_enviar = new JButton("Salvar");
     botao_enviar.addActionListener(this);
    add(botao_enviar);
    }
    @Override
    public void actionPerformed(ActionEvent al) {
        
        
         String valor_nome1 = field_Nome.getText();
         int valor_CPF = Integer.parseInt(field_CPF.getText());
         int valor_RG = Integer.parseInt(field_RG.getText());
         int valor_telefone = Integer.parseInt(field_telefone.getText());
         String valor_rua = field_rua.getText();
         String valor_numerodacasa = field_numerodacasa.getText();
         String valor_bairro = field_bairro.getText();
         
         String armazena = "Nome: "+valor_nome1+"\n"
                 +"CPF : "+valor_CPF+"\n"
                 +"RG: "+valor_RG+"\n"
                 +"Telefone :"+valor_telefone+"\n"
                 +"Rua: "+valor_rua+"\n"
                 +"Número da Casa: "+valor_numerodacasa+"\n"
                 +"Bairro:"+valor_bairro;
         
        JOptionPane.showMessageDialog(null, armazena);
    }
  
}
