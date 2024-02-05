package spring.io.rest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class InsaneServiceRegistryApplication {
    public static void main(String[] args) {
        SpringApplication.run(InsaneServiceRegistryApplication.class, args);
    }
}
