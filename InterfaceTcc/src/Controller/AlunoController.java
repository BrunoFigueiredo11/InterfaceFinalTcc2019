/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import DAO.AlunoDAO;
import Modelo.Aluno;
import Modelo.Endereco;
import javax.swing.JOptionPane;

/**
 *
 * @author bruno
 */
public class AlunoController {
    // cadastrar aluno
    public void cadastraralun(String nome, String dt_nasc, String origem, String serie, String tr, String tc, String email,
             String rnome, String rgp, String rdt_nasc,String rcpf,String rrg,String rorg_exp,String rdia,
            String rano,String rcel, String remail) {
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
        c.setRcel(rcel);
        c.setRemail(remail);
            

        AlunoDAO d = new AlunoDAO();
        d.cadaluno(c);
       } 
    
     public void altalun(String nome, String dt_nasc, String origem, String serie, String tr, String tc, String email,
             String rnome, String rgp, String rdt_nasc,String rcpf,String rrg,String rorg_exp,String rdia,
            String rano,String rcel, String remail,int ctr) {
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
        c.setRcel(rcel);
        c.setRemail(remail);
        c.setCtr(ctr);
            

        AlunoDAO d = new AlunoDAO();
        d.altluno(c);
        JOptionPane.showMessageDialog(null, "Aluno Alterado com Sucesso");
    } 
    public void pesquisar(String inf, Aluno a) {
        AlunoDAO l = new AlunoDAO();        
        l.pesquisar(inf, a);
    }
     public void pesquisarEnde(String inf, Aluno a,Endereco e) {
        AlunoDAO l = new AlunoDAO();        
        l.pesquisarEnd(inf, a,e);
    }
}
