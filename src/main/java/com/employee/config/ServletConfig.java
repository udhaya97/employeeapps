package com.employee.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
@ComponentScan({"com.employee"})
@EnableWebMvc
public class ServletConfig {
	
	@Bean
	public InternalResourceViewResolver viewResolver()
	{
		InternalResourceViewResolver vr = new InternalResourceViewResolver();
		
		vr.setPrefix("/WEB-INF/jsps/");
		vr.setSuffix(".jsp");
		return vr;
	}

}
