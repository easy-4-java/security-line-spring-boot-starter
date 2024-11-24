package org.springframework.security.boot;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = SecurityLineProperties.PREFIX)
@Getter
@Setter
@ToString
public class SecurityLineProperties {

	public static final String PREFIX = "spring.security.line";

	/** Whether Enable Line AccessToken Authentication. */
	private boolean enabled = false;

}
