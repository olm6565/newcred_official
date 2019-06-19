package br.com.olmti.newcred.dao;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import br.com.olmti.newcred.model.Origem;
import br.com.olmti.newcred.model.TpEstadoCivil;


@Repository("tpEstadoCivilDAO")
public interface TpEstadoCivilDAO extends JpaRepository<TpEstadoCivil, Long> {
	
	List<TpEstadoCivil> findAll();
	
}
	
	
