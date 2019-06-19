package br.com.olmti.newcred.dao;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.olmti.newcred.model.Cliente;


@Repository("clienteDAO")
public interface ClienteDAO extends JpaRepository<Cliente, Long> {
	
	List<Cliente> findAll();
	
}
	
	
