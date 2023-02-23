package com.example.demo;

import java.io.PrintWriter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TestApplication {

	public static void main(String[] args) {
		SpringApplication.run(TestApplication.class, args);
		System.out.println("welcome to springboot!!");
		
		
		PrintWriter out= new PrintWriter(System.out);
		out.print("<h1>"+"Welcome to Springboot"+"</h1>");
		
	}

}
