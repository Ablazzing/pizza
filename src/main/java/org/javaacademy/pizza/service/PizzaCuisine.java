package org.javaacademy.pizza.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class PizzaCuisine {
    @Autowired
    private PizzaCuisine pizzaCuisine;

    public String createPizza(Integer money) {
      return pizzaCuisine.createPizzaHelper(money);
    }

    public String createPizzaHelper(Integer money) {
        return pizzaCuisine.createPizzaHelper2(money);
    }

    public String createPizzaHelper2(Integer money) {
        if (money == 100) {
            return "Маленькая пицца";
        } else if (money > 100) {
            return "Отдай большую пиццу";
        }
        throw new RuntimeException("Нет денег на пиццу");
    }
}
