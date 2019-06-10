/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Modelo.Dia;
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
public class DiaDAO {
    Connection c;

    public DiaDAO() {
        c = new ConnectionFactory().conexao();
    }
     //listando Dia JComboBox
    public List<Dia> ListaJCB(String campo, String inf) {
        try {
            List<Dia> dia = new ArrayList<Dia>();
            PreparedStatement stmt = this.c.prepareStatement
            ("select * from dia where " + campo + " like '%" + inf + "%'");
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                
               Dia d = new Dia();
                d.setId_dia(rs.getInt("id_dia"));
                d.setDia(rs.getString("dia"));
               dia.add(d);
            }
            rs.close();
            stmt.close();
            return dia;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
