package com.distribuida;

import com.distribuida.model.Cliente;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LibreriaApplication {

	public static void main(String[] args) {
		SpringApplication.run(LibreriaApplication.class, args);

		System.out.println("Hola mundo");

		Cliente cliente = new Cliente(
				1
				,"1500970270"
				,"Anthony"
				,"Viracucha"
				,"Quito"
				,"0982512184"
				,"anthonyvifdsds@sdsy.xom"
		);

		System.out.println(cliente.toString());

	}

}
