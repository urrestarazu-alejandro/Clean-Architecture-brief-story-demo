package com.teatalks.clean.architecture.usecase.impl;

import com.teatalks.clean.architecture.entities.Discount;
import com.teatalks.clean.architecture.entities.Pizza;
import com.teatalks.clean.architecture.entities.responses.InfoPizzaResponse;
import com.teatalks.clean.architecture.usecase.ApplyPizzaDiscountUseCase;
import com.teatalks.clean.architecture.usecase.GetDiscountUseCase;
import com.teatalks.clean.architecture.usecase.GetInfoPizzaWithDiscountUseCase;
import com.teatalks.clean.architecture.usecase.GetPizzaUseCase;
import com.teatalks.clean.architecture.factories.impl.UseCaseFactoryImpl;

public class GetInfoPizzaWithDiscountUseCaseImpl implements GetInfoPizzaWithDiscountUseCase {

    @Override
    public InfoPizzaResponse get(Model model) {
        UseCaseFactoryImpl useCaseFactory = new UseCaseFactoryImpl(); // use your preferred dependency injection
        GetPizzaUseCase getPizzaUseCase = useCaseFactory.createGetPizzaUseCase();

        Pizza pizza = getPizzaUseCase.get(new GetPizzaUseCase.Model(model.getPizzaName()));

        GetDiscountUseCase getDiscountUseCase = useCaseFactory.createGetDiscountUseCase();
        Discount discount = getDiscountUseCase.get(new GetDiscountUseCase.Model(model.getDiscountCode()));

        ApplyPizzaDiscountUseCase applyDiscount = useCaseFactory.createApplyPizzaDiscountUseCase();
        pizza = applyDiscount.apply(pizza, discount);

        InfoPizzaResponse response = new InfoPizzaResponse();
        response.setPizza(pizza);
        response.setDiscount(discount);

        return response;
    }
}
