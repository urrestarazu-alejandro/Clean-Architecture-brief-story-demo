package com.teatalks.demo.layered.presentation;

import com.teatalks.demo.layered.domain.Discount;
import com.teatalks.demo.layered.presentation.model.InfoPizzaResponse;
import com.teatalks.demo.layered.domain.Pizza;
import com.teatalks.demo.layered.persistence.DiscountMemoryRepository;
import com.teatalks.demo.layered.persistence.PizzaMemoryRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PizzaController {
    @GetMapping("/info/pizza/{pizzaName}/discount/{discountCode}")
    public ResponseEntity<InfoPizzaResponse> info(@PathVariable("pizzaName") String pizzaName,
                                                  @PathVariable("discountCode") String discountCode) {

        PizzaMemoryRepository pizzaMemoryRepository = new PizzaMemoryRepository();
        Pizza pizza = pizzaMemoryRepository.get(pizzaName);

        DiscountMemoryRepository discountMemoryRepository = new DiscountMemoryRepository();
        Discount discount = discountMemoryRepository.get(discountCode);

        if (pizza != null) {
            pizza.applyDiscount(discount);
        }

        InfoPizzaResponse response = new InfoPizzaResponse();

        if (pizza == null) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(response);
        }

        response.setPizza(pizza);
        response.setDiscount(discount);

        return ResponseEntity.ok(response);
    }
}
