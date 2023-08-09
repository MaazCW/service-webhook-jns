package com.opl.boot;

import com.opl.jns.published.lib.utils.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.*;
import org.springframework.context.annotation.*;
import org.springframework.scheduling.annotation.*;

@SpringBootApplication
@ComponentScan(basePackages = {"com.opl"})
@EnableScheduling
@EnableAsync
@EnableConfigurationProperties(ApplicationProperties.class)
public class ServiceWebhookJnsApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServiceWebhookJnsApplication.class, args);
	}

}
