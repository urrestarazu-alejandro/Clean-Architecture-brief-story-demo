package com.teatalks.demo.layered.persistence;

import com.teatalks.demo.layered.domain.Pizza;
import com.teatalks.demo.layered.domain.PizzaName;
import com.teatalks.demo.layered.domain.PizzaSize;

import java.util.Arrays;
import java.util.HashMap;

public class PizzaMemoryRepository {
    private HashMap<String, Pizza> pizzas;

    public PizzaMemoryRepository() {
        this.pizzas = new HashMap<>();

        //Mock Data
        Pizza margarita = new Pizza();
        margarita.setName(PizzaName.MARGARITA);
        margarita.setIngredients(Arrays.asList("mozzarella", "basil", "salt", "pepper"));
        margarita.setSize(PizzaSize.MEDIUM);
        margarita.setPrice(10f);

        Pizza fugazzeta = new Pizza();
        fugazzeta.setName(PizzaName.FUGAZZETA);
        fugazzeta.setIngredients(Arrays.asList("mozzarella", "basil", "salt", "pepper","A lot of onion"));
        fugazzeta.setSize(PizzaSize.MEDIUM);
        fugazzeta.setPrice(20f);

        this.pizzas.put(margarita.getName().toString().toLowerCase(), margarita);
        this.pizzas.put(fugazzeta.getName().toString().toLowerCase(), fugazzeta);
    }

    public Pizza get(String name) {
        return pizzas.get(name.toLowerCase());
    }
}
