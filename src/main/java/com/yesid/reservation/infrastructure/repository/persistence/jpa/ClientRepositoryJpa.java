package com.yesid.reservation.infrastructure.repository.persistence.jpa;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.yesid.reservation.infrastructure.repository.entity.ClientEntity;

public interface ClientRepositoryJpa extends JpaRepository<ClientEntity, String>{
	
	@Query("select c.id from ClientEntity c where c.dni = :dni")
	public String getIdByDni(@Param("dni") String dni);
	
	public boolean existsByDni(String dni);
	
	public ClientEntity findByDni(String dni);

}
