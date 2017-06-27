package com.restful.config;

import io.swagger.annotations.ApiKeyAuthDefinition;
import io.swagger.annotations.SecurityDefinition;
import io.swagger.annotations.SwaggerDefinition;
import io.swagger.jaxrs.Reader;
import io.swagger.jaxrs.config.ReaderListener;
import io.swagger.models.SecurityRequirement;
import io.swagger.models.Swagger;

/**
 * Swagger 对应处理字段，主要添加统一处理的权限校验，包含JSON 转换忽略字段
 * 
 * @author AMS
 *
 */
@SwaggerDefinition(securityDefinition = @SecurityDefinition(apiKeyAuthDefinitions = {
		@ApiKeyAuthDefinition(in = ApiKeyAuthDefinition.ApiKeyLocation.HEADER, key = "token", name = "E-token"),
		@ApiKeyAuthDefinition(in = ApiKeyAuthDefinition.ApiKeyLocation.HEADER, key = "userId", name = "E-userId"),
		@ApiKeyAuthDefinition(in = ApiKeyAuthDefinition.ApiKeyLocation.HEADER, key = "corpId", name = "E-corpId") }) )
public class SwaggerCustomizeDefinition implements ReaderListener {

	@Override
	public void beforeScan(Reader reader, Swagger swagger) {
	}

	@Override
	public void afterScan(Reader reader, Swagger swagger) {
		swagger.addSecurity(new SecurityRequirement().requirement("token"));
		swagger.addSecurity(new SecurityRequirement().requirement("userId"));
		swagger.addSecurity(new SecurityRequirement().requirement("corpId"));
	}

}
