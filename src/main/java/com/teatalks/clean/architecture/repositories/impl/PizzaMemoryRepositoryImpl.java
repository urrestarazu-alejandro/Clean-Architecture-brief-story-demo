package com.teatalks.clean.architecture.repositories.impl;

import com.teatalks.clean.architecture.entities.Pizza;
import com.teatalks.clean.architecture.entities.PizzaName;
import com.teatalks.clean.architecture.entities.PizzaSize;
import com.teatalks.clean.architecture.repositories.PizzaMemoryRepository;

import java.util.Arrays;
import java.util.HashMap;

public class PizzaMemoryRepositoryImpl implements PizzaMemoryRepository {
    private HashMap<String, Pizza> pizzas;

    public PizzaMemoryRepositoryImpl() {
        this.pizzas = new HashMap<>();

        //Mock Data
        Pizza margarita = new Pizza();
        margarita.setName(PizzaName.MARGARITA);
        margarita.setIngredients(Arrays.asList("mozzarella", "basil", "salt", "pepper"));
        margarita.setSize(PizzaSize.MEDIUM);
        margarita.setPrice(10f);

        Pizza fugazzeta = new Pizza();
        fugazzeta.setName(PizzaName.FUGAZZETA);
        margarita.setIngredients(Arrays.asList("mozzarella", "basil", "salt", "pepper","A lot of onion"));
        margarita.setSize(PizzaSize.MEDIUM);
        margarita.setPrice(20f);

        this.pizzas.put(margarita.getName().toString().toLowerCase(), margarita);
        this.pizzas.put(fugazzeta.getName().toString().toLowerCase(), fugazzeta);
    }

    public Pizza get(String name) {
        return pizzas.get(name.toLowerCase());
    }
}
