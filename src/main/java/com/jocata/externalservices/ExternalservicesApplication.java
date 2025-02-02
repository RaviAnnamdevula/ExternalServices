package com.jocata.externalservices;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

@SpringBootApplication
public class ExternalservicesApplication {

	public static void main(String[] args) {
		ExecutorService executorService = Executors.newFixedThreadPool(4);
		executorService.submit(new Runnable() {
			@Override
			public void run() {
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					throw new RuntimeException(e);
				}
				SpringApplication.run(ExternalservicesApplication.class, args);
			}
		});
	}
}
