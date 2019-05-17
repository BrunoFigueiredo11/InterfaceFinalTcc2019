package Controller;

import DAO.UsuarioDAO;
import Modelo.Usuario;
import javax.swing.JOptionPane;

public class UsuarioController {
  // cadastrar usuario
    public void cadusu(String usuario, String senha) {
        Usuario u = new Usuario();
        u.setUsuario(usuario);
        u.setSenha(senha);

        UsuarioDAO d = new UsuarioDAO();
        d.cadusuario(u);
        JOptionPane.showMessageDialog(null, " Usuario cadastrado com Sucesso!!!");
    }
 
    
    
}
