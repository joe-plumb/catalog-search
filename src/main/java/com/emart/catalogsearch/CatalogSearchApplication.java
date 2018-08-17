package com.emart.catalogsearch;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CatalogSearchApplication {

	public static void main(String[] args) {
		
		System.setProperty("javax.net.ssl.trustStore","c:/Users/JOSEPHPlumb/java/jre.1.8.0_181/lib/security/cacerts");
        System.setProperty("javax.net.ssl.trustStorePassword","changeit");
		
		SpringApplication.run(CatalogSearchApplication.class, args);
	}
}
