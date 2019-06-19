package br.com.olmti.newcred.dao;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import br.com.olmti.newcred.model.Origem;


@Repository("origemDAO")
public interface OrigemDAO extends JpaRepository<Origem, Long> {
	
	List<Origem> findAll();
	
}
	
	
