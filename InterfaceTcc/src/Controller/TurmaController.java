/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import DAO.TurmaDAO;
import Modelo.Turma;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import view.TelaAguarde;
import view.TelaPrincipalAdm;

/**
 *
 * @author bruno
 */
public class TurmaController {
    // cadastrar aluno

    public void cadastraturm(String curso, String dia, String horario, String funcionario, String sala) {
        Turma t = new Turma();
        t.setCurso(curso);
        t.setDia(dia);
        t.setHorario(horario);
        t.setFuncionario(funcionario);
        t.setSala(sala);

        TurmaDAO d = new TurmaDAO();
        d.cadturm(t);

        TelaAguarde v = new TelaAguarde();

    }

    public void altturm(String curso, String dia, String horario, String funcionario, String sala, int id_turm) {
        Turma t = new Turma();
        t.setCurso(curso);
        t.setDia(dia);
        t.setHorario(horario);
        t.setFuncionario(funcionario);
        t.setSala(sala);
        t.setId_turmas(id_turm);

        TurmaDAO d = new TurmaDAO();
        d.alteturm(t);
        JOptionPane.showMessageDialog(null, "Aluno Alterado com Sucesso");
    }
}
