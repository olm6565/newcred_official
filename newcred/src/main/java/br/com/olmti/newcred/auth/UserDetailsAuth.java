package br.com.olmti.newcred.auth;


	import org.springframework.beans.factory.annotation.Autowired;
//	import org.springframework.security.core.GrantedAuthority;
//	import org.springframework.security.core.authority.SimpleGrantedAuthority;
//	import org.springframework.security.core.userdetails.UserDetails;
//	import org.springframework.security.core.userdetails.UserDetailsService;
//	import org.springframework.security.core.userdetails.UsernameNotFoundException;
	import org.springframework.stereotype.Service;
	import org.springframework.transaction.annotation.Transactional;

import br.com.olmti.newcred.dao.UsuarioDAO;
import br.com.olmti.newcred.model.Usuario;

import java.util.HashSet;
	import java.util.Set;

	@Service
	public class UserDetailsAuth {
	    @Autowired
	    private Usuario usuario;
	    
	    @Autowired
	    private UsuarioDAO usuarioDAO;

//	    @Override
//	    @Transactional(readOnly = true)
//	    public UserDetails loadUserByUsername(String username) {
//	        Usuario user = usuarioDAO.findLogin(username);
//	        if (user == null) throw new UsernameNotFoundException(username);
//
//	        Set<GrantedAuthority> grantedAuthorities = new HashSet<>();
////	        for (Role role : user.getRoles()){
////	            grantedAuthorities.add(new SimpleGrantedAuthority(role.getName()));
////	        }
//
//	        return new org.springframework.security.core.userdetails.User(user.getUsuario(), user.getSenha(), grantedAuthorities);
//	    }

		public Usuario getUsuario() {
			return usuario;
		}

		public void setUsuario(Usuario usuario) {
			this.usuario = usuario;
		}
	}

