/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Views;

import java.util.Objects;
import javax.swing.JTable;

/**
 *
 * @author João Paulo <jpmsap37@gmail.com>
 */
public class Lista_Produto {
    private JTable tabela;
    private String[] coluna = {"ID", "descrição", "preco", "quantidade"};
    private Objects[][] dados = {
        {"01", "teste", "201,00", "12"},
      
        
        
            
    };
DefaultTabeleMode1 modelo = new DefaultTable(dados, coluna);
}
