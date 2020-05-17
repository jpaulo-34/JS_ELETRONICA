/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package DAO;

import Bean.Bean_Orcamento;
import java.sql.Connection;
import java.sql.PreparedStatement;

/**
 *
 * @author João Paulo <jpmsap37@gmail.com>
 */
public class OrcamentoDAO {
    public static void adicionar(Bean_Orcamento o){
        String sql = "INSERT INTO Orcamento (Valor, Quantidade, Contratante, Servico, data, validade) VALUES(?,?,?,?,?,?)";
        Connection conexao = Conexao_DB.retornaConexao(); 
        
        try{
            PreparedStatement stmt = conexao.prepareStatement(sql);
            
            stmt.setDouble(1, o.getValor());
            stmt.setInt(2, o.getQuantidade());
            stmt.setString(3, o.getContratante());
            stmt.setString(4, o.getServicoPrestado());
            stmt.setInt(5, o.getDataDeEmissao());
            stmt.setInt(6, o.getValidade());
            
            stmt.execute();
        }catch(Exception e){
            System.err.println("Erro ao Adicionar Orcamento"+e.toString());
        }
    }
}
