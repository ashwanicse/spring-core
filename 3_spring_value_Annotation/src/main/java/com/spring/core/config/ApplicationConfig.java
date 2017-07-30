package com.spring.core.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class ApplicationConfig {

	@Value("${size}")
	private String fileUploadMaxSize;
	
	@Value("${java.version}")
	private String javaVersion;

	@Override
	public String toString() {
		return "ApplicationConfig [fileUploadMaxSize=" + fileUploadMaxSize + ", javaVersion=" + javaVersion + "]";
	}
	
	
}
