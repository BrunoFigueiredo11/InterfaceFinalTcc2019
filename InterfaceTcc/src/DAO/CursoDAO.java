/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Modelo.Curso;
import Projeto.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author bruno
 */
public class CursoDAO {
     Connection c;

    public CursoDAO() {
        c = new ConnectionFactory().conexao();
    }
    // metodo adicionar curso
    public void addcur (Curso add){
    String sql = "insert into curso(id_curso,curso,carga_horaria,descricao) values (default,?,?,?);";
        try {
            PreparedStatement stmt = c.prepareStatement(sql);
            stmt.setString(1, add.getCurso());
            stmt.setString(2, add.getCarga_horaria());
            stmt.setString(3, add.getDescricao());
            stmt.execute();
            stmt.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
} 
    // metodo de listar cursos
    
    public List<Curso> getLista(String campo, String inf){
        try {
            List<Curso> listCurso = new ArrayList<>();
            PreparedStatement stmt = this.c.prepareStatement("select c.curso, c.carga_horaria, c.descricao from curso c;");
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {                
                Curso lC = new Curso();
                lC.setId_curso(rs.getInt("id_curso"));
                lC.setCarga_horaria(rs.getString("carga_horaria"));
                lC.setCurso(rs.getString("curso"));
                lC.setDescricao(rs.getString("descricao"));
            }
            rs.close();
            stmt.close();
            return listCurso;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }  
    
     public List<Curso> getLista1(){
        try {
            List<Curso> listCurso = new ArrayList<>();
            PreparedStatement stmt = this.c.prepareStatement("select c.curso, c.carga_horaria , c.descricao from curso c;");
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {                
                Curso lC = new Curso();
                 lC.setCurso(rs.getString("c.curso"));
                lC.setCarga_horaria(rs.getString("c.carga_horaria"));
                lC.setDescricao(rs.getString("c.descricao"));
               listCurso.add(lC);
            }
            rs.close();
            stmt.close();
            return listCurso;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
}
}