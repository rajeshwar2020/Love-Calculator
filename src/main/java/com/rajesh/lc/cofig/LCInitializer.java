package com.rajesh.lc.cofig;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class LCInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {

	@Override
	protected Class<?>[] getRootConfigClasses() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		Class array[] = {LoveCalculatorAppConfig.class};
		return array;
	}

	@Override
	protected String[] getServletMappings() {
		String array[] = {"/home.com/*", "/"};
		return array;
	}

}
