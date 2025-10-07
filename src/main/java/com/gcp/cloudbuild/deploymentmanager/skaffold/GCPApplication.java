package com.gcp.cloudbuild.deploymentmanager.skaffold;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GCPApplication {
	public static void main(String[] args) {
		SpringApplication.run(GCPApplication.class, args);
	}
}