package io.github.laminalfalah.centralized;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableConfigServer
@EnableDiscoveryClient
@SpringBootApplication
public class ConfigCentralizedApplication {

  public static void main(String[] args) {
    SpringApplication.run(ConfigCentralizedApplication.class, args);
  }

}
