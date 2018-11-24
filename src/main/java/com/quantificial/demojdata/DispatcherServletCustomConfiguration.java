package com.quantificial.demojdata;


import javax.swing.Spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.web.servlet.DispatcherServletAutoConfiguration;
import org.springframework.boot.autoconfigure.web.servlet.DispatcherServletPath;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

//@Configuration("ModuleNameConfiguration")
@Configuration
public class DispatcherServletCustomConfiguration {

//    @Bean
//    public DispatcherServlet dispatcherServlet() {
//        return new DispatcherServlet();
//    }
	
	@Autowired
	private ApplicationContext context;

    @Bean("ModuleName")
	public ServletRegistrationBean<DispatcherServlet> dispatcherServletRegistration() {
    	

//        DispatcherServlet dispatcherServlet = new DispatcherServlet();
//        AnnotationConfigWebApplicationContext applicationContext = new AnnotationConfigWebApplicationContext();
//        applicationContext.register(DispatcherServletCustomConfiguration.class);
//    	
//        dispatcherServlet.setApplicationContext(applicationContext);
//        ServletRegistrationBean<DispatcherServlet> servletRegistrationBean = new ServletRegistrationBean<DispatcherServlet>(dispatcherServlet,
//                "/module-name" + "/*");
//        
//        servletRegistrationBean.setName("moduleName");
//        return servletRegistrationBean;
        
    	DispatcherServlet dispatcherServlet = new DispatcherServlet();
    	 AnnotationConfigWebApplicationContext applicationContext = new AnnotationConfigWebApplicationContext();
    	 applicationContext.register(DispatcherServletCustomConfiguration.class);
    	dispatcherServlet.setApplicationContext(applicationContext);

    	
        ServletRegistrationBean<DispatcherServlet> registration = new ServletRegistrationBean<DispatcherServlet>(dispatcherServlet, "/module-name/*");
        registration.setName("ModuleName");
        
        return registration;
        
    }
    
    
    @Bean("ModuleName2")
	public ServletRegistrationBean<DispatcherServlet> dispatcherServletRegistration2() {
    	

//        DispatcherServlet dispatcherServlet = new DispatcherServlet();
//        AnnotationConfigWebApplicationContext applicationContext = new AnnotationConfigWebApplicationContext();
//        applicationContext.register(DispatcherServletCustomConfiguration.class);
//    	
//        dispatcherServlet.setApplicationContext(applicationContext);
//        ServletRegistrationBean<DispatcherServlet> servletRegistrationBean = new ServletRegistrationBean<DispatcherServlet>(dispatcherServlet,
//                "/module-name" + "/*");
//        
//        servletRegistrationBean.setName("moduleName");
//        return servletRegistrationBean;
        
    	DispatcherServlet dispatcherServlet = new DispatcherServlet();
    	 AnnotationConfigWebApplicationContext applicationContext = new AnnotationConfigWebApplicationContext();
    	 applicationContext.register(DispatcherServletCustomConfiguration.class);
    	dispatcherServlet.setApplicationContext(applicationContext);

    	
        ServletRegistrationBean<DispatcherServlet> registration = new ServletRegistrationBean<DispatcherServlet>(dispatcherServlet, "/module-name2/*");
        registration.setName("ModuleName2");
        
        return registration;
        
    }    
}