package org.javaacademy.pizza.service;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class PizzaCuisineProxy {
    private PizzaCuisine pizzaCuisine;

    public String createPizza(Integer money) {
        //log.info("");
        return pizzaCuisine.createPizza(money);
        //log.info("");
    }
}
