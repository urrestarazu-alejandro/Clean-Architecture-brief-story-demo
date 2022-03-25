package com.teatalks.clean.architecture.usecase;

import com.teatalks.clean.architecture.entities.Discount;
import com.teatalks.clean.architecture.entities.Pizza;

public interface ApplyPizzaDiscountUseCase {
    Pizza apply(Pizza pizza, Discount discount);
}
