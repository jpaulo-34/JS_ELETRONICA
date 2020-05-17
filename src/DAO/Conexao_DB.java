/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


/**
 *
 * @author João Paulo <jpmsap37@gmail.com>
 */
public class Conexao_DB {
    private static final String User = "root";
    private static final String Senha = "lamparina";
    private static final String URL_BANCO = "jdbc:mysql://127.0.0.1:3306/js_eletronica?useTimezone=true&serverTimezone=UTC";


public static Connection retornaConexao(){
    Connection conexao = null;
 try{
    Class.forName("com.mysql.cj.jdbc.Driver");
    conexao = DriverManager.getConnection(URL_BANCO, User, Senha);
    
}catch(SQLException e){
    System.err.println("Erro de Conexao:" + e.toString());
         
}catch (ClassNotFoundException ex) {
            System.err.println("Classe não encontrada:"+ ex.toString());
        }

return conexao;
}
}
