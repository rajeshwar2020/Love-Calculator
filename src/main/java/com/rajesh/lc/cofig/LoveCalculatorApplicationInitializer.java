package com.rajesh.lc.cofig;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;



public class LoveCalculatorApplicationInitializer {}
/*
public class LoveCalculatorApplicationInitializer implements WebApplicationInitializer {

	@Override
	public void onStartup(ServletContext servletContext) throws ServletException {

		// This is used when we have XML spring configuration file.
		
//		XmlWebApplicationContext webApplicationContext = new XmlWebApplicationContext();
//		webApplicationContext.setConfigLocation("classpath:beans.xml");
		
		
		AnnotationConfigWebApplicationContext webApplicationContext = new AnnotationConfigWebApplicationContext();
		webApplicationContext.register(LoveCalculatorAppConfig.class);
		
		//create DispatcherServlet object
		DispatcherServlet dispatcherServlet = new DispatcherServlet(webApplicationContext);
		
		//register dispatcherServlet with servletContext.
		ServletRegistration.Dynamic dynamicServlet = servletContext.addServlet("rajesh-dispatchSerlvet", dispatcherServlet);
		
		dynamicServlet.setLoadOnStartup(1);
		dynamicServlet.addMapping("/home.com/*");
	}

}
*/
