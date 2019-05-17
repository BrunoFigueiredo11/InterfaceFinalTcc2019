/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import DAO.EnderecoDAO;
import Modelo.Endereco;

/**
 *
 * @author bruno
 */
public class EnderecoController {
     public void addendereco(String estado,String cidade,String rua,String bairro,String numero,String cep,String complemento){
    Endereco e = new Endereco();
    e.setEstado(estado);
    e.setCidade(cidade);
    e.setRua(rua);
    e.setBairro(bairro);
    e.setNumero(numero);
    e.setCep(cep);
    e.setComplemento(complemento);
    
    EnderecoDAO d= new EnderecoDAO();
    d.endereco(e);
    
    };
    
}
