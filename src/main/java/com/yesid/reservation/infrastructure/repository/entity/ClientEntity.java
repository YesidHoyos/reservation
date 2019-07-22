package com.yesid.reservation.infrastructure.repository.entity;

import java.time.LocalDateTime;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

import org.hibernate.annotations.GenericGenerator;

import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@Table(name = "client", uniqueConstraints={@UniqueConstraint(columnNames={"dni"})})
@Data
@NoArgsConstructor
public class ClientEntity {
	
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
	private Set<ReserveEntity> reserves;

}
