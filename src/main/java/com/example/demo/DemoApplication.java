package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.StreamingHttpOutputMessage;
import org.springframework.web.bind.annotation.*;


@SpringBootApplication
@RestController
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@PostMapping("/listaitem")
	public int saveItem(@RequestBody ListaItems listaItems) {
		System.out.println("ID:" + listaItems.getId());
		System.out.println("sap:" + listaItems.getSap());
		System.out.println("barra:" + listaItems.getBarra());
		System.out.println("cant:" + listaItems.getCant());
		System.out.println("iditem:" + listaItems.getIditem());
		System.out.println("idlista:" + listaItems.getIdlista());
		return 111 ;
	}
}

/*
@SpringBootApplication
@RestController
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@GetMapping("/hello")
	public String hello(@RequestParam(value = "name", defaultValue = "World") String name) {
		return String.format("Hello %s!", name);
	}
}
*/