package com.yesid.reservation.infrastructure.repository.persistence.jpa;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.yesid.reservation.infrastructure.repository.entity.RoomEntity;

public interface RoomRepositoryJpa extends JpaRepository<RoomEntity, String>{
	
	@Query("select r from RoomEntity r where r.status = 'D' and r.city = :city")
	public List<RoomEntity> findAvailableRoomsByCity(@Param("city") String city);
	
	@Query("select r.status from RoomEntity r where r.id = :id")
	public String getStatusById(@Param("id") String id);
	
	@Query("select r.price from RoomEntity r where r.id = :id")
	public BigDecimal getPriceById(@Param("id") String id);

	@Query("update RoomEntity set status = 'D' where id = :id")
	public void updateStatusAvailableById(@Param("id") String id);
	
	@Query("update RoomEntity set status = 'ND' where id = :id")
	public void updateStatusNoAvailableById(@Param("id") String id);
}
