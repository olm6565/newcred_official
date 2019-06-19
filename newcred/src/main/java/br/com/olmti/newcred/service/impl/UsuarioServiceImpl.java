package br.com.olmti.newcred.service.impl;

import java.util.HashSet;

import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import br.com.olmti.newcred.dao.UsuarioDAO;
import br.com.olmti.newcred.model.Usuario;
import br.com.olmti.newcred.service.UsuarioService;

@Service
public class UsuarioServiceImpl implements UsuarioService {
	
    @Autowired
    private UsuarioDAO usuarioDAO;
//    @Autowired
//    private RoleRepository roleRepository;

//    private BCryptPasswordEncoder bCryptPasswordEncoder = new BCryptPasswordEncoder();

    @Override
    public void save(Usuario usuario) {
    	//usuario.setSenha(bCryptPasswordEncoder.encode(usuario.getSenha()));
       // user.setRoles(new HashSet<>(roleRepository.findAll()));
        usuarioDAO.save(usuario);
    }

	@Override
	public Usuario findLoginSenha(String usuario, String senha) {
		return usuarioDAO.findLoginSenha(usuario, senha);
	}

	@Override
	public Usuario findLogin(String usuario) {
		// TODO Auto-generated method stub
		return usuarioDAO.findLogin(usuario);
	}
}

