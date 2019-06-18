/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Projeto.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author bruno
 */
public class LoginDAO {

    Connection c;

    public LoginDAO() {
        c = new ConnectionFactory().conexao();
    }

    public boolean checkLoginadm(String login, String senha) {

        PreparedStatement stmt = null;
        ResultSet rs = null;

        boolean checkadm = false;

        try {

            stmt = c.prepareStatement("SELECT * FROM funcionario WHERE usuario = ? and senha = ? and funcao = 'diretoria'");
            stmt.setString(1, login);
            stmt.setString(2, senha);

            rs = stmt.executeQuery();

            if (rs.next()) {

                checkadm = true;
            }

        } catch (SQLException ex) {
            Logger.getLogger(UsuarioDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            ConnectionFactory.closeConnection(c, stmt, rs);
        }

        return checkadm;

    }

    public boolean checkLoginProf(String login, String senha) {

        PreparedStatement stmt = null;
        ResultSet rs = null;

        boolean checkprof = false;

        try {

            stmt = c.prepareStatement("SELECT * FROM funcionario WHERE usuario = ? and senha = ? and funcao = 'professor'");
            stmt.setString(1, login);
            stmt.setString(2, senha);

            rs = stmt.executeQuery();

            if (rs.next()) {

                checkprof = true;
            }

        } catch (SQLException ex) {
            Logger.getLogger(UsuarioDAO.class.getName()).log(Level.SEVERE, null, ex);
        }

        return checkprof;

    }

    public boolean checkLogin(String login, String senha) {

        PreparedStatement stmt = null;
        ResultSet rs = null;

        boolean check = false;

        try {

            stmt = c.prepareStatement("SELECT * FROM funcionario WHERE usuario = ? and senha = ? and funcao = 'secretaria'");
            stmt.setString(1, login);
            stmt.setString(2, senha);

            rs = stmt.executeQuery();

            if (rs.next()) {

                check = true;
            }

        } catch (SQLException ex) {
            Logger.getLogger(UsuarioDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            ConnectionFactory.closeConnection(c, stmt, rs);
        }

        return check;

    }
}
