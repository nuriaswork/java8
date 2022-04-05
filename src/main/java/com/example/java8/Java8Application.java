package com.example.java8;


/*
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
*/

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

//@SpringBootApplication
public class Java8Application {

	public static void main(String[] args) {
//		SpringApplication.run(Java8Application.class, args);

		List<String> lista = List.of("uno","dos","tres");
		Stream<String> stream = lista.stream();
		System.out.println(stream.collect(Collectors.toList()));
	}

}
