package com.senai.DaviCampos.repositories;

 import org.springframework.data.jpa.repository.JpaRepository;
 
 import com.senai.DaviCampos.entities.Cliente;

 public interface ClienteRepository extends JpaRepository<Cliente, Long> {
	 
 }
