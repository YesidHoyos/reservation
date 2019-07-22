package com.yesid.reservation.infrastructure.repository.persistence.jpa;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.yesid.reservation.infrastructure.repository.entity.ReserveEntity;

public interface ReserveRepositoryJpa extends JpaRepository<ReserveEntity, String>{

	public List<ReserveEntity> findByClient(String client);
	
	@Query("update ReserveEntity set status = 'C' where id = :id and client = :client")
	public void updateStatusCanceledById(@Param("id") String id, @Param("client") String client);
	
	@Query("update ReserveEntity set status = 'F' where id = :id and client = :client")
	public void updateStatusCompletedById(@Param("id") String id, @Param("client") String client);
}
