package com.yesid.reservation.infrastructure.repository.entity;

import java.time.LocalDateTime;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

import lombok.Data;

@Entity
@Table(name = "client")
@Data
public class Client {
	
	@Id
	@GeneratedValue(generator = "system-uuid")
	@GenericGenerator(name="system-uuid", strategy = "uuid2")
	private String id;
	private String firstName;
	private String lastName;
	private String dni;
	private LocalDateTime birthDate;
	private String phone;
	private String email;
	
	@OneToMany(mappedBy = "client")
	private Set<Reserve> reserves;
	
	public Client() {
		
	}
}
