package com.teatalks.demo.layered.presentation.model;

import com.teatalks.demo.layered.domain.Discount;
import com.teatalks.demo.layered.domain.Pizza;

public class InfoPizzaResponse {
    private Pizza pizza;
    private Discount discount;

    public Pizza getPizza() {
        return pizza;
    }

    public void setPizza(Pizza pizza) {
        this.pizza = pizza;
    }

    public Discount getDiscount() {
        return discount;
    }

    public void setDiscount(Discount discount) {
        this.discount = discount;
    }
}
