/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Principal;


import Bean.Bean_Clientes;
import Bean.Bean_Orcamento;
import Bean.Bean_Produtos;
import Bean.Bean_Tecnico;
import Bean.Bean_Vendas;
import Layout.Janela;

/*
import java.awt.BorderLayout;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
*/import static javax.swing.JFrame.EXIT_ON_CLOSE;/*
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
*/

/**
 *
 * @author 201816810
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
          
        
        Bean_Tecnico tec = new Bean_Tecnico("Jp", "123456789", "TI", "08092001", 250.00, "Ensino Médio Completo");
        
        System.out.println("Técnico");
        System.out.println("Nome: " +tec.getName());
        System.out.println("Especialização Técnica: " +tec.getEspecializacao());
        System.out.println("CPF: " +tec.getCPF());
        System.out.println("Data de nascimento: " +tec.getDataNasc());
        System.out.println("Salário: "+tec.getSalario());
        System.out.println("Formação Escolar: "+tec.getFormacao());
        
        System.out.println("--------------------------------"); //quebra de linha
        
        Bean_Produtos produto1 = new Bean_Produtos("Joao", "xxx", "12345", "empoeirado", "nenhum", 741);
      
        System.out.println("Produto");
        System.out.println("Titular: "+produto1.getTitular());
        System.out.println("Modelo: "+produto1.getModelo());
        System.out.println("Número de Sérire: "+produto1.getNumDeSerie());
        System.out.println("Nota Fiscal: "+produto1.getNumNotaFiscal());
        System.out.println("Acessórios: "+produto1.getAceesorios());
        System.out.println("Condições Físicas: "+produto1.getCondicoesDoProduto());
        
        
        
        System.out.println("--------------------------------"); //quebra de linha
        Bean_Clientes cliente1 = new Bean_Clientes("Joaozinho",3214568, 1234, 99999, "Rua 2", "30AB", "java");
        
        System.out.println("Cliente");
        System.out.println("Nome: "+cliente1.getNome());
        System.out.println("CPF: "+cliente1.getCPF());
        System.out.println("RG: "+cliente1.getRG());
        System.out.println("Telefone: "+cliente1.getTelefone());
        System.out.println("Rua: "+cliente1.getRua());
        System.out.println("Número da rua: "+cliente1.getNumRua());
        System.out.println("Bairro: "+cliente1.getBairro());
        
        System.out.println("--------------------------------"); //quebra de linha
        
        Bean_Orcamento orcamento1 = new Bean_Orcamento(50.00, 1, "Jpzinho", "Limpeza", 20012020 , 2);
        System.out.println("Ficha de Orçamento ");
        System.out.println("Valor R$:"+orcamento1.getValor());
        System.out.println("Quantidade :"+orcamento1.getQuantidade());
        System.out.println("Contratante: "+orcamento1.getContratante());
        System.out.println("Serviço Prestado: "+orcamento1.getServicoPrestado());
        System.out.println("Data de Emissão: "+orcamento1.getDataDeEmissao());
        System.out.println("Validade: "+orcamento1.getValidade());
        
        System.out.println("--------------------------------"); //quebra de linha
        
        Bean_Vendas venda1 = new Bean_Vendas(10, 5, 3, 2, 1);
        
        System.out.println("Talão de Vendas");
        System.out.println("Peças Avulsas :"+venda1.getPecasAvulsas());
        System.out.println("Televisores :"+venda1.getTelevisores());
        System.out.println("Geladeiras: "+venda1.getGeladeiras());
        System.out.println("Lavadoras: "+venda1.getLavadoras());
        System.out.println("Aparelhos de som: "+venda1.getAparelhoDeSom());
        
        Janela janela = new Janela();
               
                janela.setDefaultCloseOperation(EXIT_ON_CLOSE);
               
    }
        
}