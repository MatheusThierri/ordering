package com.algaworks.algashop.ordering.domain.valueobject;

import java.util.Objects;

import static com.algaworks.algashop.ordering.domain.exception.ErrorMessages.*;

public record Phone(String value) {
    public Phone(String value) {
        Objects.requireNonNull(value, VALIDATION_ERROR_PHONE_IS_NULL);

        if(value.isBlank()) {
            throw new IllegalArgumentException(VALIDATION_ERROR_PHONE_IS_BLANK);
        }

        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }
}
