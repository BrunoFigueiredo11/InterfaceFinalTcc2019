/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Modelo.Aluno;
import Projeto.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author bruno
 */
public class AlunoDAO {
     Connection c;

    public AlunoDAO() {
        c = new ConnectionFactory().conexao();
    }
    
     public void cadaluno (Aluno cada){
    String sql = "INSERT INTO aluno(nome,dt_nasc,origem,serie,tr,tc,email,id_ende,rnome,rgp,rdt_nasc,rcpf,rrg,rorg_exp,rdia,rano,rtc,remail) "
            + "values (?,?,?,?,?,?,?,(select max(id_end)from endereco),?,?,?,?,?,?,?,?,?,?);";
        try {
            PreparedStatement stmt = c.prepareStatement(sql);
            stmt.setString(1, cada.getNome());
            stmt.setString(2, cada.getDt_nasc());
            stmt.setString(3, cada.getOrigem());
            stmt.setString(4, cada.getSerie());
            stmt.setString(5, cada.getTr());
            stmt.setString(6, cada.getTc());
            stmt.setString(7, cada.getEmail());
            
            
            stmt.setString(8, cada.getRnome());
            stmt.setString(9, cada.getRgp());
            stmt.setString(10, cada.getRdt_nasc());
            stmt.setString(11, cada.getRcpf());
            stmt.setString(12, cada.getRrg());
            stmt.setString(13, cada.getRorg_exp());
            stmt.setString(14, cada.getRdia());
            stmt.setString(15, cada.getRano());
            stmt.setString(16, cada.getRtc());
            stmt.setString(17, cada.getRemail());
            
            
            stmt.execute();
            stmt.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
      }
     
     
}
