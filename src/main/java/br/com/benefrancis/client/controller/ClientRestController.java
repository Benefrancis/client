package br.com.benefrancis.client.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.benefrancis.client.dto.out.ClientDto;
import br.com.benefrancis.client.entity.Client;
import br.com.benefrancis.client.service.ClientService;

@RestController
public class ClientRestController {

	@Autowired
	private ClientService service;

	@GetMapping("/")
	@PreAuthorize("hasRole('ROLE_admin')")
	public List<ClientDto> findAll() {
		List<ClientDto> resposta = new ArrayList<>();
		List<Client> all = service.findAll();
		if (!all.isEmpty()) {

			for (Client client : all) {
				resposta.add(new ClientDto(client));
			}
		}
		return resposta;
	}
}
