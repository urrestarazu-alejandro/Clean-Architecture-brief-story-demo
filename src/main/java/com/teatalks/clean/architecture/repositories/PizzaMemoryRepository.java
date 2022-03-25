package com.teatalks.clean.architecture.repositories;

import com.teatalks.clean.architecture.entities.Pizza;

/**
 * Pizza Memory Repository
 * Interface Adapters layer
 */
public interface PizzaMemoryRepository {
    Pizza get(String name);
}
