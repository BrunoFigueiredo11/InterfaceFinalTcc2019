/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import DAO.TurmaDAO;
import Modelo.Turma;
import javax.swing.JOptionPane;

/**
 *
 * @author bruno
 */
public class TurmaController {
     // cadastrar aluno
    public void cadastraturm(String curso, String dias, String horarios, String funcionario, String sala) {
       Turma t = new Turma();
        t.setCurso(curso);
        t.setDias(dias);
        t.setHorarios(horarios);
        t.setFuncionario(funcionario);
        t.setSala(sala);
                  

       TurmaDAO d = new TurmaDAO();
        d.cadturm(t);
        JOptionPane.showMessageDialog(null, "Aluno Cadastrado com Sucesso");
    } 
}
