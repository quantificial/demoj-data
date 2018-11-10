package com.quantificial.demojdata;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import springfox.documentation.spring.data.rest.configuration.SpringDataRestConfiguration;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
//@Import(SpringDataRestConfiguration.class) // if want to expose repository as rest become api
public class SwaggerConfig {
}