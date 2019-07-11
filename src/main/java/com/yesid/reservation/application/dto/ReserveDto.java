package com.yesid.reservation.application.dto;

import java.time.LocalDateTime;

import lombok.Data;

@Data
public class ReserveDto {

	private LocalDateTime checkIn;
	private LocalDateTime checkOut;
	private int numberPeople;
	private String room;
	private String client;
}
