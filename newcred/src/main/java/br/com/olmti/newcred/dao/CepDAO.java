package br.com.olmti.newcred.dao;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import br.com.olmti.newcred.model.Cep;
import br.com.olmti.newcred.model.Origem;
import br.com.olmti.newcred.model.Usuario;


@Repository("cepDAO")
public interface CepDAO extends JpaRepository<Cep, Long> {
	
	@Query("select u from Cep u where u.cep = :cep")
	Cep findByCep(@Param("cep") Integer cep);
	
	
	
}
	
	
