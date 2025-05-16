package br.com.alurafood.pagamentos;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

// Anotação para ele saber que é um cliente Eureka
@EnableEurekaClient
@SpringBootApplication
/*
@EnableFeignClients é usada no Spring para habilitar o uso de clientes Feign em um projeto.
Feign é um cliente HTTP declarativo que permite fazer chamadas HTTP a outros serviços apenas
definindo interfaces Java com anotações. Ele facilita a comunicação entre microsserviços.
 */
@EnableFeignClients
public class PagamentosApplication {

	public static void main(String[] args) {
		SpringApplication.run(PagamentosApplication.class, args);
	}

}
