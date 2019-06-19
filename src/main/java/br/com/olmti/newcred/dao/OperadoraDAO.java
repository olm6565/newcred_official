package br.com.olmti.newcred.dao;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.olmti.newcred.model.Operadora;
import br.com.olmti.newcred.model.Origem;
import br.com.olmti.newcred.model.TpEstadoCivil;


@Repository("OperadoraDAO")
public interface OperadoraDAO extends JpaRepository<Operadora, Long> {
	
	List<Operadora> findAll();
	
}
	
	
