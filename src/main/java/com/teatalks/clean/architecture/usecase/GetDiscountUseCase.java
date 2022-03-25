package com.teatalks.clean.architecture.usecase;

import com.teatalks.clean.architecture.entities.Discount;

public interface GetDiscountUseCase {
    Discount get(Model model);

    class Model {
        private final String code;

        public Model(String code) {
            this.code = code;
        }

        public String getCode() {
            return code;
        }
    }
}
