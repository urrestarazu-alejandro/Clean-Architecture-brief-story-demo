package com.teatalks.clean.architecture.factories;

import com.teatalks.clean.architecture.repositories.DiscountMemoryRepository;
import com.teatalks.clean.architecture.repositories.PizzaMemoryRepository;

/**
 * abstract factory to avoid using a dependency injection library. Only for demo purpouse.
 */
public interface RepositoryFactory {
    DiscountMemoryRepository createDiscountMemoryRepository();

    PizzaMemoryRepository createPizzaMemoryRepository();
}
