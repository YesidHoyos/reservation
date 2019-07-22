package com.yesid.reservation.domain.repository;

import com.yesid.reservation.domain.model.ClientDto;

public interface ReceptionistRepository {

	public String saveClient(ClientDto client);
}
