/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import DAO.CursoDAO;
import Modelo.Curso;
import javax.swing.JOptionPane;

/**
 *
 * @author bruno
 */
public class CursoController {
    // adicionar cursos   ok
    public void adicionarcurso(String curso,String cargahoraria,String descricao){
    Curso a = new Curso();
    a.setCurso(curso);
    a.setCarga_horaria(cargahoraria);
    a.setDescricao(descricao);
    
    CursoDAO d = new CursoDAO();
    d.addcur(a);
    JOptionPane.showMessageDialog(null,"Curso Adicionado com Sucesso");
    
    };
}
