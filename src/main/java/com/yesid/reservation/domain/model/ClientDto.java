package com.yesid.reservation.domain.model;

import java.time.LocalDateTime;

import lombok.Data;

@Data
public class ClientDto {

	private String firstName;
	private String lastName;
	private String dni;
	private LocalDateTime birthDate;
	private String phone;
	private String email;
	
}
