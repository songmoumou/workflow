package com.song.flowable;

import com.song.flowable.config.ApplicationConfiguration;
import com.song.flowable.servlet.AppDispatcherServletConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Import;
import org.springframework.transaction.annotation.EnableTransactionManagement;



@Import({
		ApplicationConfiguration.class,
		AppDispatcherServletConfiguration.class
})
@ComponentScan(basePackages = {"com.song.flowable"})
@EnableTransactionManagement
@SpringBootApplication(exclude = {SecurityAutoConfiguration.class})
public class FlowableWebApplication {

	public static void main(String[] args) {
		SpringApplication.run(FlowableWebApplication.class, args);
	}

}
