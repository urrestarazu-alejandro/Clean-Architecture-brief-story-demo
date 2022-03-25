package com.teatalks.clean.architecture.entities.responses;


import com.teatalks.clean.architecture.entities.Discount;
import com.teatalks.clean.architecture.entities.Pizza;

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
