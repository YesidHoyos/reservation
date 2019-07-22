package com.yesid.reservation.infrastructure.repository.persistence;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.yesid.reservation.domain.model.ClientDto;
import com.yesid.reservation.domain.repository.ReceptionistRepository;
import com.yesid.reservation.infrastructure.repository.builder.ClientBuilder;
import com.yesid.reservation.infrastructure.repository.entity.ClientEntity;
import com.yesid.reservation.infrastructure.repository.persistence.jpa.ClientRepositoryJpa;
import com.yesid.reservation.infrastructure.repository.persistence.jpa.ReserveRepositoryJpa;
import com.yesid.reservation.infrastructure.repository.persistence.jpa.RoomRepositoryJpa;

@Component
public class ReceptionistRepositoryImpl implements ReceptionistRepository{

	@Autowired
	ClientRepositoryJpa clientRepositoryJpa;
	ReserveRepositoryJpa reserveRepositoryJpa;
	RoomRepositoryJpa roomRepositoryJpa;
	
	public ReceptionistRepositoryImpl(ClientRepositoryJpa clientRepositoryJpa, ReserveRepositoryJpa reserveRepositoryJpa, RoomRepositoryJpa roomRepositoryJpa) {
		this.clientRepositoryJpa = clientRepositoryJpa;
		this.reserveRepositoryJpa = reserveRepositoryJpa;
		this.roomRepositoryJpa = roomRepositoryJpa;
	}

	@Override
	@Transactional
	public String saveClient(ClientDto client) {
		ClientEntity clientEntity = clientRepositoryJpa.save(ClientBuilder.convertToEntity(client));
		return clientEntity.getId();
	}
}
