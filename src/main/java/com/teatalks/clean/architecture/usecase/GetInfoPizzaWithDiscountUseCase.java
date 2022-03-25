package com.teatalks.clean.architecture.usecase;

import com.teatalks.clean.architecture.entities.responses.InfoPizzaResponse;

public interface GetInfoPizzaWithDiscountUseCase {
    InfoPizzaResponse get(Model model);

    class Model {
        private final String pizzaName;
        private final String discountCode;

        public Model(String pizzaName, String discountCode) {
            this.pizzaName = pizzaName;
            this.discountCode = discountCode;
        }

        public String getPizzaName() {
            return pizzaName;
        }

        public String getDiscountCode() {
            return discountCode;
        }
    }
}
