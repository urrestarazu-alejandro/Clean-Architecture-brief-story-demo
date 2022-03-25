package com.teatalks.clean.architecture.repositories.impl;

import com.teatalks.clean.architecture.entities.Discount;
import com.teatalks.clean.architecture.repositories.DiscountMemoryRepository;

import java.util.HashMap;

public class DiscountMemoryRepositoryImpl implements DiscountMemoryRepository {
    private HashMap<String, Discount> discounts;

    public DiscountMemoryRepositoryImpl() {
        this.discounts = new HashMap<>();

        //Mock Data
        Discount opening = new Discount();
        opening.setCode("OPENING");
        opening.setPercentage(10f);

        discounts.put("OPENING", opening);
    }

    public Discount get(String name) {
        return discounts.get(name);
    }
}
