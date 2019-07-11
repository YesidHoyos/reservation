package com.yesid.reservation.domain.model;

import java.math.BigDecimal;

import lombok.Data;

@Data
public class RoomDto {

	private String address;
	private String description;
	private String hotel;
	private String city;
	private BigDecimal price;
	private String rating;
}
