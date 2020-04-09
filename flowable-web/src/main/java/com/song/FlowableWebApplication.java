package com.song;

import com.song.config.AppDispatcherServletConfiguration;
import com.song.config.ApplicationConfiguration;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.context.annotation.Import;

@Import({
		ApplicationConfiguration.class,
		AppDispatcherServletConfiguration.class
})
@SpringBootApplication(
		exclude = {SecurityAutoConfiguration.class})

public class FlowableWebApplication {

	public static void main(String[] args) {
		SpringApplication.run(FlowableWebApplication.class, args);
	}

}
