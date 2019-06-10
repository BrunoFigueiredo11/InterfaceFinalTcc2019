/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;
import Modelo.Turma;
import Projeto.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
/**
 *
 * @author bruno
 */
public class TurmaDAO {
    Connection c;

    public TurmaDAO() {
        c = new ConnectionFactory().conexao();
    }
    
    public void cadturm(Turma turm) {
        String sql = "insert into turmas values(default,(select max(ctr)from aluno),(select c.id_curso from curso as c where c.curso = ?),"
                + "(select id_horario from horario where horario = '" +turm.getHorario()+ "'),(select id_dia from dia where dia = '"+turm.getDia()+"'),(select f.id_funcionario from funcionario as f where f.fnome = ?),?);";
;
        try {
            PreparedStatement stmt = c.prepareStatement(sql);
            stmt.setString(1, turm.getCurso());
            stmt.setString(2, turm.getFuncionario());
            stmt.setString(3, turm.getSala());
            
            

            stmt.execute();
            stmt.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        
    }
    
    public void alteturm(Turma turm) {
        String sql = "update turmas set id_curso =(select c.id_curso from curso as c where c.curso = ?),"
                + "id_horario=(select id_horario from horario where horario = '" +turm.getHorario()+ "'),id_dia=(select id_dia from dia where dia = '"+turm.getDia()+"'),"
                + "id_funcionario=(select f.id_funcionario from funcionario as f where f.fnome = ?),sala=? where id_turmas = ?;";
;
        try {
            PreparedStatement stmt = c.prepareStatement(sql);
            stmt.setString(1, turm.getCurso());
            stmt.setString(2, turm.getFuncionario());
            stmt.setString(3, turm.getSala());
            stmt.setInt(4,turm.getId_turmas());
            
            

            stmt.execute();
            stmt.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        
    }
}
