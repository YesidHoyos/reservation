package com.yesid.reservation.infrastructure.repository.persistence;

import org.springframework.stereotype.Component;

import com.yesid.reservation.infrastructure.repository.persistence.jpa.ClientRepositoryJpa;
import com.yesid.reservation.infrastructure.repository.persistence.jpa.ReserveRepositoryJpa;
import com.yesid.reservation.infrastructure.repository.persistence.jpa.RoomRepositoryJpa;

@Component
public class ReceptionistRepository {

	ClientRepositoryJpa clientRepositoryJpa;
	ReserveRepositoryJpa reserveRepositoryJpa;
	RoomRepositoryJpa roomRepositoryJpa;
	
	public ReceptionistRepository(ClientRepositoryJpa clientRepositoryJpa, ReserveRepositoryJpa reserveRepositoryJpa, RoomRepositoryJpa roomRepositoryJpa) {
		this.clientRepositoryJpa = clientRepositoryJpa;
		this.reserveRepositoryJpa = reserveRepositoryJpa;
		this.roomRepositoryJpa = roomRepositoryJpa;
	}
}
