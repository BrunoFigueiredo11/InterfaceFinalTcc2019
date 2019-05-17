/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import DAO.FuncionarioDAO;
import Modelo.Funcionario;
import javax.swing.JOptionPane;

/**
 *
 * @author bruno
 */
public class FuncionarioController {
    // cadastrar Funcionario    

    public void cadfunc(String nome, String tel, String celular, String rg, String estado, String cidade, String rua,
            String bairro, String numero, String cep, String complemento,String usuario,String senha,String funcao) {
        Funcionario f = new Funcionario();
        f.setNome(nome);
        f.setTelefone(tel);
        f.setCelular(celular);
        f.setRg(rg);
        f.setEstado(estado);
        f.setCidade(cidade);
        f.setRua(rua);
        f.setBairro(bairro);
        f.setNumero(numero);
        f.setCep(cep);
        f.setComplemento(complemento);
        f.setUsuario(usuario);
        f.setSenha(senha);
        f.setFuncao(funcao);

        FuncionarioDAO d = new FuncionarioDAO();
        d.cadnfuncionario(f);
        JOptionPane.showMessageDialog(null, "Funcionário Cadastrado com Sucesso");
    }
}
