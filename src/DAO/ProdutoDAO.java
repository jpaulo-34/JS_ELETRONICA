/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package DAO;

import Bean.Bean_Produtos;
import java.sql.Array;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;


/**
 *
 * @author João Paulo <jpmsap37@gmail.com>
 */
public class ProdutoDAO {

         
             
     public static void adicionar(Bean_Produtos p){
     
     String sql = "INSERT INTO produtos (Titular, Modelo, Numerodeserie, CondicoesProduto, Acessorios, NumNotaFiscal) VALUES(?,?,?,?,?,?)";
     Connection conexao = Conexao_DB.retornaConexao();   
     
     try{
    PreparedStatement stmt = conexao.prepareStatement(sql);
    
    stmt.setString(1, p.getTitular());
    stmt.setString(2, p.getModelo());
    stmt.setString(3, p.getNumDeSerie());
    stmt.setString(4, p.getCondicoesDoProduto());
    stmt.setString(5, p.getAcessorios());
    stmt.setInt(6, p.getNumNotaFiscal());
    
    stmt.execute();
    
}catch(Exception e){
    System.err.println("Erro ao Adicionar Produto"+e.toString());
}
     }
     
     public static ArrayList<Bean_Produtos> listar(){
         
         ArrayList<Bean_Produtos> produtos = new ArrayList<>();
         String sql = "SELECT * FROM produtos";
         
        try{
            Connection conexao = Conexao_DB.retornaConexao();
            PreparedStatement stmt = conexao.prepareStatement(sql);
            
            ResultSet dados = stmt.executeQuery();
            
        while (dados.next()){
            Bean_Produtos temporario = new Bean_Produtos();
            temporario.setID(dados.getInt("id"));
            temporario.setTitular(dados.getString("Titular"));
            temporario.setModelo(dados.getString("Modelo"));
            temporario.setNumDeSerie(dados.getString("Numero de serie"));
            temporario.setCondicoesDoProduto(dados.getString("Condições do produto"));
            temporario.setAcessorios(dados.getString("Acessorios"));
            temporario.setNumNotaFiscal(dados.getInt("Numero da nota"));
            
            produtos.add(temporario);
        }
        }catch(Exception e){}
        
        return produtos;
        
        
        
}
     }
     /*public void excluir(){}
     
     public void atualizar(){}
     
     
}
*/