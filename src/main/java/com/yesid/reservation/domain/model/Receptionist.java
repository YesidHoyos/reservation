package com.yesid.reservation.domain.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.yesid.reservation.domain.repository.ReceptionistRepository;
import com.yesid.reservation.domain.services.RegisterClientServices;

@Component
public class Receptionist implements RegisterClientServices{
	
	@Autowired
	ReceptionistRepository receptionistRepository;

	public String registerClient(ClientDto client) {
		return receptionistRepository.saveClient(client);
	}
}
