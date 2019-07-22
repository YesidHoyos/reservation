package com.yesid.reservation.infrastructure.repository.builder;

import com.yesid.reservation.domain.model.ClientDto;
import com.yesid.reservation.infrastructure.repository.entity.ClientEntity;

public class ClientBuilder {

	public static ClientEntity convertToEntity(ClientDto clientDto) {
		ClientEntity clientEntity = new ClientEntity();
		clientEntity.setFirstName(clientDto.getFirstName());
		clientEntity.setLastName(clientDto.getLastName());
		clientEntity.setDni(clientDto.getDni());
		clientEntity.setEmail(clientDto.getEmail());
		clientEntity.setBirthDate(clientDto.getBirthDate());
		clientEntity.setPhone(clientDto.getPhone());
		return clientEntity;
	}
}
