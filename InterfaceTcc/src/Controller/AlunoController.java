/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import DAO.AlunoDAO;
import Modelo.Aluno;
import javax.swing.JOptionPane;

/**
 *
 * @author bruno
 */
public class AlunoController {
    // cadastrar aluno
    public void cadastraralun(String nome, String dt_nasc, String origem, String serie, String tr, String tc, String email,
             String rnome, String rgp, String rdt_nasc,String rcpf,String rrg,String rorg_exp,String rdia,
            String rano,String rtc, String remail) {
       Aluno c = new Aluno();
        c.setNome(nome);
        c.setDt_nasc(dt_nasc);
        c.setOrigem(origem);
        c.setSerie(serie);
        c.setTr(tr);
        c.setTc(tc);
        c.setEmail(email);
        c.setRnome(rnome);
        c.setRgp(rgp);
        c.setRdt_nasc(rdt_nasc);
        c.setRcpf(rcpf);
        c.setRrg(rrg);
        c.setRorg_exp(rorg_exp);
        c.setRdia(rdia);
        c.setRano(rano);
        c.setRtc(rtc);
        c.setRemail(remail);
            

        AlunoDAO d = new AlunoDAO();
        d.cadaluno(c);
        JOptionPane.showMessageDialog(null, "Aluno Cadastrado com Sucesso");
    }
}
