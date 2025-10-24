package com.dgw.backend;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.MessageSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.support.ResourceBundleMessageSource;


@SpringBootApplication
public class BackendApplication {

	@Value("${spring.messages.basename}")
	private String messagesBasename;

	@Value("${spring.messages.encoding}")
	private String messagesEncoding;

	public static void main(String[] args) {
		SpringApplication.run(BackendApplication.class, args);

	}

	// Defining MessageSource as a bean for Spring to manage
	@Bean
	public MessageSource messageSource() {
		ResourceBundleMessageSource messageSource = new ResourceBundleMessageSource();
		messageSource.setBasenames(messagesBasename);
		messageSource.setDefaultEncoding(messagesEncoding);
		
		return messageSource;
	}
}
