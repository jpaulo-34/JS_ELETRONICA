/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Views;

import java.awt.Button;
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
public class Form_Orcamento extends JPanel implements ActionListener{

    private JTextField field_valor;
    private JTextField field_quantidade;
    private JTextField field_contratante;
    private JTextField field_servicoprestado;
    private JTextField field_datadeemissao;
    private JTextField field_validade;
    private JButton botao_enviar;
    
    public Form_Orcamento(){
        setLayout(new GridLayout(8,1));
        
        JLabel label_valor = new JLabel("Valor");
        add(label_valor);
        
        field_valor = new JTextField(20);
        add(field_valor);
        
        JLabel label_quantidade = new JLabel ("Quantidade");
        add(label_quantidade);
        
        field_quantidade = new JTextField(20);
        add(field_quantidade);
        
        JLabel label_contratante = new JLabel("Contratante");
        add(label_contratante);
        
        field_contratante = new JTextField(20);
        add(field_contratante);
        
        JLabel label_servicoprestado = new JLabel("Serviço Prestado");
        add(label_servicoprestado);
        
        field_servicoprestado = new JTextField(20);
        add(field_servicoprestado);
        
        JLabel label_datadeemissao = new JLabel ("Data de Emissão");
        add(label_datadeemissao);
        
        field_datadeemissao = new JTextField(20);
        add(field_datadeemissao);
        
        JLabel label_validade = new JLabel("Validade");
        add(label_validade);
        
        field_validade = new JTextField(20);
        add(field_validade);
        
        JButton botao_enviar = new JButton("Salvar");
     botao_enviar.addActionListener(this);
    add(botao_enviar);
        
        
    }
    
    @Override
    public void actionPerformed(ActionEvent ae) {
        
        double valor_valor = Double.parseDouble(field_valor.getText());
        int valor_quantidade = Integer.parseInt(field_quantidade.getText());
        String valor_contratante = field_contratante.getText();
        String valor_servicoprestado = field_servicoprestado.getText();
        int valor_datadeemissao = Integer.parseInt(field_datadeemissao.getText());
        int valor_validade = Integer.parseInt(field_validade.getText());
        
        String armazem = "Valor: "+valor_valor+"\n"
                 +"Qunaridade : "+valor_quantidade+"\n"
                 +"Contratante: "+valor_contratante+"\n"
                 +"Serviço Prestado :"+valor_servicoprestado+"\n"
                 +"Data de Emissao: "+valor_datadeemissao+"\n"
                 +"Data de valiadade: "+valor_validade;
         
        JOptionPane.showMessageDialog(null, armazem);

    }
    
}
