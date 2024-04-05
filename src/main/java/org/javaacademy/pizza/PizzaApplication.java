package org.javaacademy.pizza;

import org.javaacademy.pizza.service.PizzaService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class PizzaApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(PizzaApplication.class, args);
		PizzaService pizzaService = context.getBean(PizzaService.class);
		System.out.println(pizzaService.takeOrder(100));
		
	}

}
