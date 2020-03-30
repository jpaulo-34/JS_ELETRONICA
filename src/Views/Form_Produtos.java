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
public class Form_Produtos extends JPanel implements ActionListener{
    
    private JTextField field_titular;
    private JTextField field_modelo;
    private JTextField field_numerodeserie;
    private JTextField field_condicoesdoproduto;
    private JTextField field_acessorios;
    private JTextField field_numerodanotafiscal;
    
    public Form_Produtos(){
    setLayout(new GridLayout(7,1));
    
    JLabel label_titular = new JLabel("Titular");
    add(label_titular);
    
    field_titular = new JTextField(20);
    add(field_titular);
    
    JLabel label_modelo = new JLabel("Modelo");
    add(label_modelo);
    
    field_modelo = new JTextField(20);
    add(field_modelo);
    
    JLabel label_numerodeserie = new JLabel("Número de Série");
    add(label_numerodeserie);
    
    field_numerodeserie = new JTextField(20);
    add(field_numerodeserie);
    
    JLabel label_condicoesdoproduto = new JLabel("Condições do Produto");
    add(label_condicoesdoproduto);
    
    field_condicoesdoproduto = new JTextField(20);
    add(field_condicoesdoproduto);
    
    JLabel label_acessorios = new JLabel("Acessórios");
    add(label_acessorios);
    
    field_acessorios = new JTextField(20);
    add(field_acessorios);
    
    JLabel label_numerodanotafiscal = new JLabel("Nota fiscal");
    add(label_numerodanotafiscal);
    
    field_numerodanotafiscal = new JTextField(20);
    add(field_numerodanotafiscal);
    
    JButton botao_enviar = new JButton("Salvar");
    botao_enviar.addActionListener(this);
    add(botao_enviar);
    
        
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        String valor_titular = field_titular.getText();
        String valor_modelo = field_modelo.getText();
        String valor_numerodeseire = field_numerodeserie.getText();
        String valor_condicoesdoproduto = field_condicoesdoproduto.getText();
        String valor_acessorios = field_acessorios.getText();
        int valor_numerodanotafiscal = Integer.parseInt(field_numerodanotafiscal.getText());
        
        String armazena = "Titular: "+valor_titular+"\n"
                +"Modelo: "+valor_modelo+"\n"
                +"Número de Série: "+valor_numerodeseire+"\n"
                +"Condições do Produto: "+valor_condicoesdoproduto+"\n"
                +"Acessórios: "+valor_acessorios+"\n"
                +"Nota Fiscal: "+valor_numerodanotafiscal;
        JOptionPane.showMessageDialog(null, armazena);
    }
    
}
    
    