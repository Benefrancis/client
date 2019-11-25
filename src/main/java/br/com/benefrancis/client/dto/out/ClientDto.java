package br.com.benefrancis.client.dto.out;

import br.com.benefrancis.client.entity.Client;
import lombok.Data;

@Data
public class ClientDto {

	public ClientDto(Client c) {

		this.id = c.getId();
		
		this.name =c.getName();

		this.redirect = c.getRedirect();

		this.scope = c.getScope();

		this.accessTokenValidity = c.getAccessTokenValidity();

		this.refreshTokenValidity = c.getRefreshTokenValidity();

		this.resourceIds = c.getResourceIds();

		this.grantTypes = c.getGrantTypes();

		this.authorities = c.getAuthorities();
	}

	private String id;

	private String name;
	
	private String redirect;

	private String scope;

	private Integer accessTokenValidity;

	private Integer refreshTokenValidity;

	private String resourceIds;

	private String grantTypes;

	private String authorities;
}