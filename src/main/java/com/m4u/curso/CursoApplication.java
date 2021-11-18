package com.m4u.curso;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@SpringBootApplication
public class CursoApplication {



	public static void main(String[] args) {
		SpringApplication.run(CursoApplication.class, args);
		System.out.println("Iniciado com sucesso!");
	}

}
