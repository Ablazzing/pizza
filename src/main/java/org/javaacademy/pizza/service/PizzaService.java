package org.javaacademy.pizza.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class PizzaService {
    //Кухня
    private PizzaCuisine cuisine;

    public String takeOrder(Integer money) {
        return cuisine.createPizza(money);
    }
}
