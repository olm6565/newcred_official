package br.com.olmti.newcred.dao;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import br.com.olmti.newcred.model.Origem;
import br.com.olmti.newcred.model.TpAcesso;
import br.com.olmti.newcred.model.Usuario;


@Repository("tpAcessoDAO")
public interface TpAcessoDAO extends JpaRepository<TpAcesso, Long> {
	List<TpAcesso> findAll();
}
	
	
