/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Modelo.Curso;
import Modelo.Horario;
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
public class HorarioDAO {
     Connection c;

    public HorarioDAO() {
        c = new ConnectionFactory().conexao();
    }
     //listando Horario JComboBox
    public List<Horario> ListaJCB(String campo, String inf) {
        try {
            List<Horario> horario = new ArrayList<Horario>();
            PreparedStatement stmt = this.c.prepareStatement
            ("select * from horario where " + campo + " like '%" + inf + "%'");
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                
               Horario c = new Horario();
                c.setId_horario(rs.getInt("id_horario"));
                c.setHorarios(rs.getString("horario"));
                horario.add(c);
            }
            rs.close();
            stmt.close();
            return horario;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    
}
