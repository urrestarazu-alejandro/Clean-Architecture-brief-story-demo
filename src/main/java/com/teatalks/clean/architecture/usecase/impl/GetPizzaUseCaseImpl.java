package com.teatalks.clean.architecture.usecase.impl;

import com.teatalks.clean.architecture.entities.Pizza;
import com.teatalks.clean.architecture.factories.RepositoryFactory;
import com.teatalks.clean.architecture.factories.impl.RepositoryFactoryImpl;
import com.teatalks.clean.architecture.repositories.PizzaMemoryRepository;
import com.teatalks.clean.architecture.usecase.GetPizzaUseCase;

public class GetPizzaUseCaseImpl implements GetPizzaUseCase {

    @Override
    public Pizza get(Model model) {
        RepositoryFactory repositoryFactory = new RepositoryFactoryImpl(); // use your preferred dependency injection
        PizzaMemoryRepository pizzaMemoryRepositoryImpl = repositoryFactory.createPizzaMemoryRepository();

        return pizzaMemoryRepositoryImpl.get(model.getName());
    }
}
