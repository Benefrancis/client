package br.com.benefrancis.client.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "oauth_client_details")
public class Client {

	@Id
	@Column(name = "client_id", nullable = false, unique = true)
	private String id;

	@Column(name = "client_secret")
	private String secret;

	@Column(name = "web_server_redirect_uri")
	private String redirect;

	@Column(name = "scope")
	private String scope;

	@Column(name = "access_token_validity")
	private Integer accessTokenValidity = 3600;

	@Column(name = "refresh_token_validity")
	private Integer refreshTokenValidity = 10000;

	@Column(name = "resource_ids")
	private String resourceIds;

	@Column(name = "authorized_grant_types")
	private String grantTypes;

	@Column(name = "authorities")
	private String authorities;

}
