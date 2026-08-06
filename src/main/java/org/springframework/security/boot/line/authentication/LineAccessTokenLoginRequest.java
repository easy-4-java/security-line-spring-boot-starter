package org.springframework.security.boot.line.authentication;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Line AccessToken 登录认证绑定的参数对象Model
 * 
 * @author ： <a href="https://github.com/easy-4-java">wandl</a>
 */
public class LineAccessTokenLoginRequest {

	/**
	 * Google AccessToken
	 */
	private String accessToken;

	@JsonCreator
	public LineAccessTokenLoginRequest(@JsonProperty("accessToken") String accessToken) {
		this.accessToken = accessToken;
	}

	public String getAccessToken() {
		return accessToken;
	}

	public void setAccessToken(String accessToken) {
		this.accessToken = accessToken;
	}

}
