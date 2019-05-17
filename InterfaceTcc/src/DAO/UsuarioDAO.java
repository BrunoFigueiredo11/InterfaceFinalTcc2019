/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Modelo.Usuario;
import Projeto.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UsuarioDAO {

    Connection c;

    public UsuarioDAO() {
        c = new ConnectionFactory().conexao();
    }
    // metodo cadastrar usuario para login

    public void cadusuario(Usuario cl) {
        String sql = "insert into usuario(usuario,senha,tipo) values (?,?,1);";
        try {
            PreparedStatement stmt = c.prepareStatement(sql);
            stmt.setString(1, cl.getUsuario());
            stmt.setString(2, cl.getSenha());
            stmt.execute();
            stmt.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }   
    }  
     
     
     
     
    
    

