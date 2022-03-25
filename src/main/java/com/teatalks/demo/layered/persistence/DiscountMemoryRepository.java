package com.teatalks.demo.layered.persistence;

import com.teatalks.demo.layered.domain.Discount;

import java.util.HashMap;

public class DiscountMemoryRepository {
    private HashMap<String, Discount> discounts;

    public DiscountMemoryRepository() {
        this.discounts = new HashMap<>();

        //Mock Data
        Discount opening = new Discount();
        opening.setCode("OPENING");
        opening.setPercentage(10f);

        discounts.put("OPENING", opening);
    }

    public Discount get(String name) {
        return discounts.get(name.toUpperCase());
    }
}
