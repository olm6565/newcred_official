package br.com.olmti.newcred.dao;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import br.com.olmti.newcred.model.Origem;
import br.com.olmti.newcred.model.TpParceria;


@Repository("tpParceriaDAO")
public interface TpParceriaDAO extends JpaRepository<TpParceria, Long> {
	
	List<TpParceria> findAll();
	
}
	
	
