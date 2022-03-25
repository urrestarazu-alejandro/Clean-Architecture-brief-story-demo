package com.teatalks.clean.architecture.factories.impl;

import com.teatalks.clean.architecture.usecase.ApplyPizzaDiscountUseCase;
import com.teatalks.clean.architecture.usecase.GetDiscountUseCase;
import com.teatalks.clean.architecture.usecase.GetInfoPizzaWithDiscountUseCase;
import com.teatalks.clean.architecture.usecase.GetPizzaUseCase;
import com.teatalks.clean.architecture.factories.UseCaseFactory;
import com.teatalks.clean.architecture.usecase.impl.ApplyPizzaDiscountUseCaseImpl;
import com.teatalks.clean.architecture.usecase.impl.GetDiscountUseCaseImpl;
import com.teatalks.clean.architecture.usecase.impl.GetInfoPizzaWithDiscountUseCaseImpl;
import com.teatalks.clean.architecture.usecase.impl.GetPizzaUseCaseImpl;

public class UseCaseFactoryImpl implements UseCaseFactory {
    @Override
    public ApplyPizzaDiscountUseCase createApplyPizzaDiscountUseCase() {
        return new ApplyPizzaDiscountUseCaseImpl();
    }

    @Override
    public GetDiscountUseCase createGetDiscountUseCase() {
        return new GetDiscountUseCaseImpl();
    }

    @Override
    public GetInfoPizzaWithDiscountUseCase createGetInfoPizzaWithDiscountUseCase() {
        return new GetInfoPizzaWithDiscountUseCaseImpl();
    }

    @Override
    public GetPizzaUseCase createGetPizzaUseCase() {
        return new GetPizzaUseCaseImpl();
    }
}
