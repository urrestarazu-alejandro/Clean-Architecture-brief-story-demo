package com.teatalks.clean.architecture.factories.impl;

import com.teatalks.clean.architecture.factories.RepositoryFactory;
import com.teatalks.clean.architecture.repositories.DiscountMemoryRepository;
import com.teatalks.clean.architecture.repositories.PizzaMemoryRepository;
import com.teatalks.clean.architecture.repositories.impl.DiscountMemoryRepositoryImpl;
import com.teatalks.clean.architecture.repositories.impl.PizzaMemoryRepositoryImpl;

public class RepositoryFactoryImpl implements RepositoryFactory {
    @Override
    public DiscountMemoryRepository createDiscountMemoryRepository() {
        return new DiscountMemoryRepositoryImpl();
    }

    @Override
    public PizzaMemoryRepository createPizzaMemoryRepository() {
        return new PizzaMemoryRepositoryImpl();
    }
}
