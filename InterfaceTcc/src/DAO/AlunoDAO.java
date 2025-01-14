/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Modelo.Aluno;
import Modelo.Curso;
import Modelo.Dia;
import Modelo.Endereco;
import Modelo.Funcionario;
import Modelo.Horario;
import Modelo.Turma;
import Projeto.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
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

    public void cadaluno(Aluno cada) {
        String sql = "INSERT INTO aluno(nome,dt_nasc,origem,serie,tr,tc,email,id_ende,rnome,rgp,rdt_nasc,rcpf,rrg,rorg_exp,rdia,rano,rcel,remail) "
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
            stmt.setString(16, cada.getRcel());
            stmt.setString(17, cada.getRemail());

            stmt.execute();
            stmt.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    //PESQUISAR ALUNO

    public void pesquisar(String inf, Aluno a, Funcionario f, Curso c, Horario h, Dia d, Turma t) {

        String sql = "select a.ctr,a.nome,a.dt_nasc , a.origem , a.serie , a.tr, a.tc, a.email, a.id_ende ,\n"
                + "a.rnome,a.rgp,a.rdt_nasc,a.rcpf,a.rrg,a.rorg_exp,a.rdia,a.rano,a.rcel,a.remail,\n"
                + "c.curso,\n"
                + "h.horario,\n"
                + "d.dia,\n"
                + "f.fnome,\n"
                + " t.sala , t.id_turmas from turmas t inner join aluno a on a.ctr = t.ctr \n"
                + "inner join curso c on c.id_curso = t.id_curso \n"
                + "inner join horario h on h.id_horario = t.id_horario \n"
                + "inner join dia d on d.id_dia = t.id_dia\n"
                + "inner join funcionario f on f.id_funcionario = t.id_funcionario where nome like '%" + inf + "%'";
        try {
            PreparedStatement stmt = this.c.prepareStatement(sql);

            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {

                a.setCtr(rs.getInt("ctr"));
                a.setNome(rs.getString("nome"));
                a.setDt_nasc(rs.getString("dt_nasc"));
                a.setOrigem(rs.getString("origem"));
                a.setSerie(rs.getString("serie"));
                a.setTr(rs.getString("tr"));
                a.setTc(rs.getString("tc"));
                a.setEmail(rs.getString("email"));
                a.setId_ende(rs.getString("id_ende"));

                a.setRnome(rs.getString("rnome"));
                a.setRgp(rs.getString("rgp"));
                a.setRdt_nasc(rs.getString("rdt_nasc"));
                a.setRcpf(rs.getString("rcpf"));
                a.setRrg(rs.getString("rrg"));
                a.setRorg_exp(rs.getString("rorg_exp"));
                a.setRdia(rs.getString("rdia"));
                a.setRano(rs.getString("rano"));
                a.setRcel(rs.getString("rcel"));
                a.setRemail(rs.getString("remail"));

                c.setCurso(rs.getString("c.curso"));
                h.setHorarios(rs.getString("h.horario"));
                d.setDia(rs.getString("d.dia"));
                f.setNome(rs.getString("f.fnome"));
                t.setSala(rs.getString("t.sala"));
                t.setId_turmas(rs.getInt("t.id_turmas"));

            }
            rs.close();
            stmt.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    //PESQUISAR ENDERECO

    public void pesquisarEnd(String inf, Aluno a, Endereco e) {
        String sql = "select * from endereco where id_end=" + inf + ";";
        try {
            PreparedStatement stmt = this.c.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {

                e.setEstado(rs.getString("estado"));
                e.setCidade(rs.getString("cidade"));
                e.setRua(rs.getString("rua"));
                e.setBairro(rs.getString("bairro"));
                e.setNumero(rs.getString("numero"));
                e.setCep(rs.getString("cep"));
                e.setComplemento(rs.getString("complemento"));

            }
            rs.close();
            stmt.close();
        } catch (SQLException d) {
            throw new RuntimeException(d);
        }
    }

    public void altluno(Aluno cada) {
        String sql = "update aluno set nome=?, dt_nasc=?,origem=?,serie=?,tr=?,tc=?,email=?,rnome=?,rgp=?,rdt_nasc=?,rcpf=?,"
                + "rrg=?,rorg_exp=?,rdia=?,rano=?,rcel=?,remail=? where ctr= ?;";
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
            stmt.setString(16, cada.getRcel());
            stmt.setString(17, cada.getRemail());
            stmt.setInt(18, cada.getCtr());
            stmt.execute();
            stmt.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

}
