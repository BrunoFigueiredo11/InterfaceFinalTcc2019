/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Modelo.Funcionario;
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

public class FuncionarioDAO {
     Connection c;

    public FuncionarioDAO() {
        c = new ConnectionFactory().conexao();
    }
    public void cadnfuncionario(Funcionario fun) {
        String sql = "INSERT INTO funcionario(id_funcionario,nome,tr,tc,rg,funcao,usuario,senha,id_end) VALUES "
                + "(default,?,?,?,?,?,?,?,(select max(id_end)from endereco));";
           
                

        try {
            PreparedStatement stmt = c.prepareStatement(sql);
            stmt.setString(1, fun.getNome());
            stmt.setString(2, fun.getTelefone());
            stmt.setString(3, fun.getCelular());
            stmt.setString(4, fun.getRg());
            stmt.setString(5, fun.getFuncao());
            stmt.setString(6, fun.getUsuario());
            stmt.setString(7, fun.getSenha());

            stmt.execute();
            stmt.close();

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    
    //listando Funcionarios
    public List<Funcionario> ListaFunc(String campo, String inf) {
        try {
            List<Funcionario> func = new ArrayList<Funcionario>();
            PreparedStatement stmt = this.c.prepareStatement
            ("select * from funcionario where " + campo + " like '%" + inf + "%' and funcao = 'Professor'");
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                
               Funcionario f = new Funcionario();
                f.setId_funcionario(rs.getInt("id_funcionario"));
                f.setNome(rs.getString("nome"));
                func.add(f);
            }
            rs.close();
            stmt.close();
            return func;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
