package com.yesid.reservation.application.handler;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.yesid.reservation.domain.model.ClientDto;
import com.yesid.reservation.domain.services.RegisterClientServices;
 
@Component
public class RegisterClientHandler {
	
	@Autowired
	RegisterClientServices registerClientServices;

	public String registerClient(ClientDto client) {
		return registerClientServices.registerClient(client);
	}
}
