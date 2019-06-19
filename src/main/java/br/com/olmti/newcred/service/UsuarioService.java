package br.com.olmti.newcred.service;

import br.com.olmti.newcred.model.Usuario;

public interface UsuarioService {
    void save(Usuario user);

    Usuario findLoginSenha(String usuario ,String senha);
	
	Usuario findLogin(String usuario);
}