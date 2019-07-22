package com.yesid.reservation.infrastructure.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.yesid.reservation.application.handler.RegisterClientHandler;
import com.yesid.reservation.domain.model.ClientDto;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

@RestController
@RequestMapping("/client")
@Api(tags = "client")
public class ClientController {
	
	@Autowired
	RegisterClientHandler registerClientHandler;

	@PostMapping
	@ApiOperation(value = "Create Client", notes = "Services to create a new customer")
	@ApiResponses(value = {@ApiResponse(code = 201, message = "Client created"), @ApiResponse(code = 400, message = "Invalid request")})
	public ResponseEntity<String> createClient(@RequestBody ClientDto client) {
		return new ResponseEntity<>(this.registerClientHandler.registerClient(client), HttpStatus.CREATED);
	}
}
