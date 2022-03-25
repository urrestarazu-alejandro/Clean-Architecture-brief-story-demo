package com.teatalks.clean.architecture.usecase.impl;

import com.teatalks.clean.architecture.entities.Discount;
import com.teatalks.clean.architecture.entities.Pizza;
import com.teatalks.clean.architecture.usecase.ApplyPizzaDiscountUseCase;

public class ApplyPizzaDiscountUseCaseImpl implements ApplyPizzaDiscountUseCase {
    @Override
    public Pizza apply(Pizza pizza, Discount discount) {

        if (discount != null) {
            float priceDiscount = pizza.getPrice() * discount.getPercentage() / 100;
            pizza.setPrice(pizza.getPrice() - priceDiscount);
        }

        return pizza;
    }
}
