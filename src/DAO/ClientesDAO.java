/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package DAO;

import Bean.Bean_Clientes;
import java.sql.Array;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
/**
 *
 * @author João Paulo <jpmsap37@gmail.com>
 */
public class ClientesDAO {
    
    public static void adicionar(Bean_Clientes c) {
        String sql ="INSERT INTO clientes (nome, CPF, RG, Telefone, Rua, numero_da_casa, Bairro) VALUES(?,?,?,?,?,?,?)";
        Connection conexao = Conexao_DB.retornaConexao();
        
        try{
            PreparedStatement stmt = conexao.prepareStatement(sql);
            
            stmt.setString(1, c.getNome());
            stmt.setInt(2, c.getCPF());
            stmt.setInt(3, c.getRG());
            stmt.setInt(4, c.getTelefone());
            stmt.setString(5, c.getRua());
            stmt.setString(6, c.getNumRua());
            stmt.setString(7, c.getBairro());
            
            stmt.execute();
                       
        }catch(Exception e){
            System.err.println("Erro ao Adicionar Cliente"+e.toString());
        }
    }
     

}
