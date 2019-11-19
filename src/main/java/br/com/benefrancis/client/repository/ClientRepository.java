package br.com.benefrancis.client.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.benefrancis.client.entity.Client;

@Repository
public interface ClientRepository extends JpaRepository<Client, String> {

}
