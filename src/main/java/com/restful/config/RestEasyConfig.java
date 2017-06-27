package com.restful.config;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Application;

import io.swagger.jaxrs.config.BeanConfig;

@ApplicationPath("/api")
@Produces("application/json;charset=UTF-8")
public class RestEasyConfig extends Application {
	public RestEasyConfig() {
		BeanConfig beanConfig = new BeanConfig();
		beanConfig.setVersion("1.0.0");
		beanConfig.setDescription("swagger document");
		beanConfig.setResourcePackage("com");
		beanConfig.setScan(true);
		beanConfig.setBasePath("/api");
		beanConfig.setSchemes(new String[] { "http" });
	}

}
