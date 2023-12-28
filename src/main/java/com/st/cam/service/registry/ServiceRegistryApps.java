package com.st.cam.service.registry;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class ServiceRegistryApps {

      public static void main(String[] args) {
           SpringApplication.run(ServiceRegistryApps.class, args);
      }

}
