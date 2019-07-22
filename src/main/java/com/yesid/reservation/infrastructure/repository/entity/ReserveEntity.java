package com.yesid.reservation.infrastructure.repository.entity;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Table(name = "reserve")
@Entity
public class ReserveEntity {

	@Id
	@GeneratedValue(generator = "system-uuid")
	@GenericGenerator(name="system-uuid", strategy = "uuid2")
	private String id;
	private LocalDateTime checkIn;
	private LocalDateTime checkOut;
	private int numberPeople; 
	private String status;
	private BigDecimal finalPrice;
	
	@ManyToOne
	@JoinColumn(name = "room_id")
	private RoomEntity room;
	
	@ManyToOne
	@JoinColumn(name = "client_id")
	private ClientEntity client;
}
