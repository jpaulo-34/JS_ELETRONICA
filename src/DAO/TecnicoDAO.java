/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package DAO;

import Bean.Bean_Tecnico;
import java.sql.Connection;
import java.sql.PreparedStatement;

/**
 *
 * @author João Paulo <jpmsap37@gmail.com>
 */
public class TecnicoDAO {
    
    public static void adicionar(Bean_Tecnico t){
        String sql = "INSERT INTO Técnico (Nome, CPF, Especialização, Data_de_Nascimento, Salário, Formação_Escolar) VALUES (?,?,?,?,?,?)";
        Connection conexao = Conexao_DB.retornaConexao(); 
        
        try{
            PreparedStatement stmt = conexao.prepareStatement(sql);
            
            stmt.setString(1, t.getName());
            stmt.setString(2, t.getCPF());
            stmt.setString(3, t.getEspecializacao());
            stmt.setString(4, t.getDataNasc());
            stmt.setDouble(5, t.getSalario());
            stmt.setString(6, t.getFormacao());
            
            stmt.execute();
        }catch(Exception e){
            System.err.println("Erro ao Adicionar Técnico"+e.toString());
        }
    }
}
