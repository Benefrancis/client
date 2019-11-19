package br.com.benefrancis.client.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.benefrancis.client.entity.Client;
import br.com.benefrancis.client.repository.ClientRepository;

@Service
public class ClientService {

	@Autowired
	private ClientRepository repo;

	public List<Client> findAll() {
		return repo.findAll();
	}
}
