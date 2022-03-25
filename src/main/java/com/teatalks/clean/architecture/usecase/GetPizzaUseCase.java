package com.teatalks.clean.architecture.usecase;

import com.teatalks.clean.architecture.entities.Pizza;

public interface GetPizzaUseCase {
    Pizza get(Model model);

    class Model {
        private final String name;

        public String getName() {
            return name;
        }

        public Model(String name) {
            this.name = name;
        }
    }
}
