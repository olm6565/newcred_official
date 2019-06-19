package br.com.olmti.newcred.dao;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import br.com.olmti.newcred.model.Usuario;


@Repository("usuarioDAO")
public interface UsuarioDAO extends JpaRepository<Usuario, Long> {
	
	@Query("select u from Usuario u where u.usuario = :usuario and u.senha = :senha")
	Usuario findLoginSenha(@Param("usuario") String usuario , @Param("senha") String senha);
	
	@Query("select u from Usuario u where u.usuario = :usuario")
	Usuario findLogin(@Param("usuario") String usuario);
	
	@Query("select u from Usuario u where u.parceria = :parceria")
	List<Usuario> findByParceria(@Param("parceria") Integer parceria);
}
	
	
