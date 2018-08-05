package io.yadnyesh.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableSwagger2
public class SpringCloudApplication {
	
	public static void main(String[] args) {
		SpringApplication.run(SpringCloudApplication.class, args);
	}
}
