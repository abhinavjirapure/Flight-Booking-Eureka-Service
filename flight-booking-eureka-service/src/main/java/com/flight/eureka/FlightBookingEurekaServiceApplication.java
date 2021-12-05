package com.flight.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
import org.springframework.web.bind.annotation.CrossOrigin;

@SpringBootApplication
@EnableEurekaServer
@CrossOrigin(origins = "*")
public class FlightBookingEurekaServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(FlightBookingEurekaServiceApplication.class, args);
	}

}
