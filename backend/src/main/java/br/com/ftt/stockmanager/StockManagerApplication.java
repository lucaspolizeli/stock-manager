package br.com.ftt.stockmanager;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication(scanBasePackages = "br.com.ftt.stockmanager")
@EntityScan(basePackages = "br.com.ftt.stockmanager.model")
public class StockManagerApplication {
	public static void main(String[] args) {
		SpringApplication.run(StockManagerApplication.class, args);
	}
}
