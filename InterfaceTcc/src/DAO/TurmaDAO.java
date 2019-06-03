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
                + "(select h.id_horario from horario as h where h.dias = ? or h.horarios = ?),(select f.id_funcionario from funcionario as f where f.nome = ?),?);";
;
        try {
            PreparedStatement stmt = c.prepareStatement(sql);
            stmt.setString(1, turm.getCurso());
            stmt.setString(2, turm.getDias());
            stmt.setString(3, turm.getHorarios());
            stmt.setString(4, turm.getFuncionario());
            stmt.setString(5, turm.getSala());
            
            

            stmt.execute();
            stmt.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        
    }
}
