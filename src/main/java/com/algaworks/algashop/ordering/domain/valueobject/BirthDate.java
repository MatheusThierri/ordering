package com.algaworks.algashop.ordering.domain.valueobject;

import java.time.LocalDate;
import java.time.Period;
import java.util.Objects;

import static com.algaworks.algashop.ordering.domain.exception.ErrorMessages.VALIDATION_ERROR_BIRTHDATE_IS_NULL;
import static com.algaworks.algashop.ordering.domain.exception.ErrorMessages.VALIDATION_ERROR_BIRTHDATE_MUST_IN_PAST;

public record BirthDate(LocalDate value) {
    public BirthDate(LocalDate value) {
        Objects.requireNonNull(value, VALIDATION_ERROR_BIRTHDATE_IS_NULL);

        if(value.isAfter(LocalDate.now())) {
            throw new IllegalArgumentException(VALIDATION_ERROR_BIRTHDATE_MUST_IN_PAST);
        }

        this.value = value;
    }

    public Integer returnAge() {
        return Period.between(value, LocalDate.now()).getYears();
    }

    @Override
    public String toString() {
        return value.toString();
    }
}
