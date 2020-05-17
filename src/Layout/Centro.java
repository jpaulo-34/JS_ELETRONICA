/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Layout;

import Views.Form_Clientes;
import Views.Form_Orcamento;
import Views.Form_Produtos;
import Views.Form_Tecnico;
import Views.Form_Vendas;

import javax.swing.JPanel;

/**
 *
 * @author 201816810
 */
public class Centro extends JPanel {
    public Centro(){
       
        add(new Form_Tecnico());
        /*add(new Form_Clientes());
        add(new Form_Vendas());
        add(new Form_Produtos());
        add(new Form_Orcamento());*/
}
    }

