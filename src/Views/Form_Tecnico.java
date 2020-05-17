/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Views;


import Bean.Bean_Tecnico;
import DAO.TecnicoDAO;
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
public class Form_Tecnico extends JPanel implements ActionListener {
    
    private JTextField field_nome ;
    private JTextField field_CPF;
    private JTextField field_especializacao;
    private JTextField field_datadenascimento;
    private JTextField field_salario;
    private JTextField field_formacaoescolar;
    private JButton botao_enviar;
   
    
    
    public Form_Tecnico(){
    setLayout(new GridLayout(7,1));
    
    JLabel label_Nome = new JLabel("Nome");
    add(label_Nome);
    
    field_nome = new JTextField(20);
    add(field_nome);
    
    JLabel label_CPF = new JLabel("CPF");
    add(label_CPF);
    
    field_CPF = new JTextField(20);
    add(field_CPF);
    
    JLabel label_especializacao = new JLabel("Especialização");
    add(label_especializacao);
    
    field_especializacao = new JTextField(20);
    add(field_especializacao);
    
    JLabel label_datadenascimento = new JLabel("Data de Nascimento");
    add(label_datadenascimento);
    
    field_datadenascimento = new JTextField(20);
    add(field_datadenascimento);
         
    JLabel label_salario = new JLabel("Salário");
    add(label_salario);
    
    field_salario = new JTextField(20);
    add(field_salario);
    
    JLabel label_formacaoescolar = new JLabel("Formação Escolar");
    add(label_formacaoescolar);
    
    field_formacaoescolar = new JTextField(20);
    add(field_formacaoescolar);
    
    
    JButton botao_enviar = new JButton("Salvar");
     botao_enviar.addActionListener(this);
    add(botao_enviar);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
         
        
         String valor_nome = field_nome.getText();
         String valor_CPF = field_CPF.getText();
         String valor_especializacao = field_especializacao.getText();
         String valor_datadenascimento = field_datadenascimento.getText();
         double valor_salario = Double.parseDouble(field_salario.getText());
         String valor_formacaoescolar = field_formacaoescolar.getText();
         
         Bean_Tecnico t = new Bean_Tecnico();
         t.setName(valor_nome);
         t.setCPF(valor_CPF);
         t.setEspecializacao(valor_especializacao);
         t.setDataNasc(valor_datadenascimento);
         t.setSalario(valor_salario);
         t.setFormacao(valor_formacaoescolar);
         
         TecnicoDAO.adicionar(t);
         /*String armazem = "Nome: "+valor_nome+"\n"
                 +"CPF : "+valor_CPF+"\n"
                 +"Especialização: "+valor_especializacao+"\n"
                 +"Data de Nascimento :"+valor_datadenascimento+"\n"
                 +"Salário: "+valor_salario+"\n"
                 +"Formação Escolar: "+valor_formacaoescolar;
         
        JOptionPane.showMessageDialog(null, armazem);*/
   }
    
    
    
}
