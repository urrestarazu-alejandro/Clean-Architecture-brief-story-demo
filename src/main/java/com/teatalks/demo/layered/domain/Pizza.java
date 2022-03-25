package com.teatalks.demo.layered.domain;

import java.util.List;

public class Pizza {
    private PizzaName name;
    private List<String> ingredients;
    private Float price;
    private PizzaSize size;

    public void applyDiscount(Discount discount) {
        if (discount != null) {
            float priceDiscount = this.getPrice() * discount.getPercentage() / 100;
            this.setPrice(this.getPrice() - priceDiscount);
        }
    }

    public PizzaName getName() {
        return name;
    }

    public void setName(PizzaName name) {
        this.name = name;
    }

    public List<String> getIngredients() {
        return ingredients;
    }

    public void setIngredients(List<String> ingredients) {
        this.ingredients = ingredients;
    }

    public Float getPrice() {
        return price;
    }

    public void setPrice(Float price) {
        this.price = price;
    }

    public PizzaSize getSize() {
        return size;
    }

    public void setSize(PizzaSize size) {
        this.size = size;
    }
}
