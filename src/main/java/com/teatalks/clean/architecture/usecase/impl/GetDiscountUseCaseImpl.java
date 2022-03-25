package com.teatalks.clean.architecture.usecase.impl;

import com.teatalks.clean.architecture.entities.Discount;
import com.teatalks.clean.architecture.factories.RepositoryFactory;
import com.teatalks.clean.architecture.factories.impl.RepositoryFactoryImpl;
import com.teatalks.clean.architecture.repositories.DiscountMemoryRepository;
import com.teatalks.clean.architecture.usecase.GetDiscountUseCase;

public class GetDiscountUseCaseImpl implements GetDiscountUseCase {
    @Override
    public Discount get(Model model) {
        RepositoryFactory repositoryFactory = new RepositoryFactoryImpl(); // use your preferred dependency injection
        DiscountMemoryRepository repository = repositoryFactory.createDiscountMemoryRepository();

        return repository.get(model.getCode().toUpperCase());
    }
}
