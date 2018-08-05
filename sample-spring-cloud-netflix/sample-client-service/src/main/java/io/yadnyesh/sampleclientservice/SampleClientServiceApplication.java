package io.yadnyesh.sampleclientservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class SampleClientServiceApplication {
	public static void main(String[] args) {
		SpringApplication.run(SampleClientServiceApplication.class, args);
	}
}
