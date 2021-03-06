package com.example.oauthservice;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.MediaType;
import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableAuthorizationServer;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;
import org.springframework.security.oauth2.provider.OAuth2Authentication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableAuthorizationServer
@EnableResourceServer
@RestController
public class OauthServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(OauthServiceApplication.class, args);
	}
	
	
	@RequestMapping(value = "/user", produces = MediaType.APPLICATION_JSON_VALUE)
	public Map<String, Object> userInfo(OAuth2Authentication oauth) {
		Map<String, Object> userinfo = new HashMap<String, Object>();
		userinfo.put("user", oauth.getUserAuthentication().getPrincipal());
		userinfo.put("authorities", AuthorityUtils.authorityListToSet(oauth.getUserAuthentication().getAuthorities()));
		return userinfo;
	}

}
