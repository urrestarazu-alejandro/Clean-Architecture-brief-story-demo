package com.teatalks.clean.architecture.controllers;

import com.teatalks.clean.architecture.entities.responses.InfoPizzaResponse;
import com.teatalks.clean.architecture.usecase.GetInfoPizzaWithDiscountUseCase;
import com.teatalks.clean.architecture.factories.impl.UseCaseFactoryImpl;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * Pizza Controller
 * Interface Adapters layer
 */
@RestController
public class PizzaController {

    @GetMapping("/info/pizza/{pizzaName}/discount/{discountCode}")
    public ResponseEntity<InfoPizzaResponse> info(@PathVariable("pizzaName") String pizzaName,
                                                  @PathVariable("discountCode") String discountCode) {

        UseCaseFactoryImpl useCaseFactory = new UseCaseFactoryImpl(); // use your preferred dependency injection
        GetInfoPizzaWithDiscountUseCase getInfoPizzaWithDiscount = useCaseFactory.createGetInfoPizzaWithDiscountUseCase();

        InfoPizzaResponse response = getInfoPizzaWithDiscount.get(new GetInfoPizzaWithDiscountUseCase.Model(pizzaName, discountCode));

        if (response.getPizza() == null) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(response);
        }

        return ResponseEntity.ok(response);
    }
}
