/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Modelo.Endereco;
import Projeto.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author bruno
 */
public class EnderecoDAO {
    Connection c;
   public EnderecoDAO() {
        c = new ConnectionFactory().conexao();
    }
    public void endereco(Endereco end){
     String id = "insert into endereco (estado,cidade,rua,bairro,numero,cep,complemento)"
            + " values(?,?,?,?,?,?,?);";
        try {
            PreparedStatement endereco = c.prepareStatement(id);
            endereco.setString(1, end.getEstado());
            endereco.setString(2, end.getCidade());
            endereco.setString(3, end.getRua());
            endereco.setString(4, end.getBairro());
            endereco.setString(5, end.getNumero());
            endereco.setString(6, end.getCep());
            endereco.setString(7, end.getComplemento());
            endereco.execute();
            endereco.close();
            
     }catch (SQLException e) {
            throw new RuntimeException(e);
        }
     }
}
