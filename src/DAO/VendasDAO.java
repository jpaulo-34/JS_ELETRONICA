/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package DAO;

import Bean.Bean_Vendas;
import java.sql.Connection;
import java.sql.PreparedStatement;

/**
 *
 * @author João Paulo <jpmsap37@gmail.com>
 */
public class VendasDAO {
    public static void adicionar(Bean_Vendas v){
        String sql = "INSERT INTO Vendas (Peças_avulsas, Televisores, Geladeiras, Lavadoras, Aparelho_de_som ) VALUES (?,?,?,?,?)";
        Connection conexao = Conexao_DB.retornaConexao();
        
        try{
    PreparedStatement stmt = conexao.prepareStatement(sql);
    
    stmt.setInt(1, v.getPecasAvulsas());
    stmt.setInt(2, v.getTelevisores());
    stmt.setInt(3, v.getGeladeiras());
    stmt.setInt(4, v.getLavadoras());
    stmt.setInt(5, v.getAparelhoDeSom());
    
    stmt.execute(); 
    
    }catch(Exception e){
        System.err.println("Erro ao Adicionar Venda"+e.toString());
            }
    }
}
