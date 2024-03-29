package com.yesid.reservation.infrastructure.repository.entity;

import java.math.BigDecimal;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Entity
@Table(name = "room")
public class RoomEntity {
	
	@Id
	@GeneratedValue(generator = "system-uuid")
	@GenericGenerator(name="system-uuid", strategy = "uuid2")
	private String id;
	private String address;
	private String description;
	private String hotel;
	private String city;
	private BigDecimal price;
	private String status;
	private String rating;
	
	@OneToMany(mappedBy = "room")
	private Set<ReserveEntity> reserves;

}
