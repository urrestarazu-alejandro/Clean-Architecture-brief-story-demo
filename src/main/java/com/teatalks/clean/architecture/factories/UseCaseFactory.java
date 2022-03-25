package com.teatalks.clean.architecture.factories;

import com.teatalks.clean.architecture.usecase.ApplyPizzaDiscountUseCase;
import com.teatalks.clean.architecture.usecase.GetDiscountUseCase;
import com.teatalks.clean.architecture.usecase.GetInfoPizzaWithDiscountUseCase;
import com.teatalks.clean.architecture.usecase.GetPizzaUseCase;

/**
 * Abstract factory to avoid a dependency injection library. Only for demo purpouse.
 */
public interface UseCaseFactory {
    ApplyPizzaDiscountUseCase createApplyPizzaDiscountUseCase();
    GetDiscountUseCase createGetDiscountUseCase();
    GetInfoPizzaWithDiscountUseCase createGetInfoPizzaWithDiscountUseCase();
    GetPizzaUseCase createGetPizzaUseCase();
}
