package com.osworks.api.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.osworks.domain.model.Client;

@RestController
public class ClientController {
	
	@GetMapping("/clients")
	public List<Client> list() {
		var client1 = new Client();
		client1.setId(1L);
		client1.setName("Daniel Nunes");
		client1.setEmail("daniel@gmail.com");
		client1.setPhone("85997149999");
		
		var client2 = new Client();
		client2.setId(2L);
		client2.setName("Patricia Pinheiro");
		client2.setEmail("patricia@gmail.com");
		client2.setPhone("85989987357");
		
		return Arrays.asList(client1, client2);
	}

}
