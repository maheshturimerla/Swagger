package com.microservices.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import static com.microservices.constants.SwaggerConstants.FORWARD_SLASH;
import static com.microservices.constants.SwaggerConstants.SWAGGER_UI;

@Configuration
public class SwaggerRouterConfiguration extends WebMvcConfigurerAdapter{
	
	@Override
	public void addViewControllers(ViewControllerRegistry registry) {
		registry.addRedirectViewController(FORWARD_SLASH, FORWARD_SLASH + SWAGGER_UI);
	}

}
