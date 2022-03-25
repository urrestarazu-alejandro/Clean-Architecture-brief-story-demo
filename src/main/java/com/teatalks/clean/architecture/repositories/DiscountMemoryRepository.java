package com.teatalks.clean.architecture.repositories;

import com.teatalks.clean.architecture.entities.Discount;

/**
 * Discount Memory Repository
 * Interface Adapters layer
 */
public interface DiscountMemoryRepository {
    Discount get(String name);
}
