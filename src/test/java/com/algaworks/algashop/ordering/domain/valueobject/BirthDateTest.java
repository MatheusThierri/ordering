package com.algaworks.algashop.ordering.domain.valueobject;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

class BirthDateTest {
    @Test
    void given_validBirthDate_whenCreateBirthDate_shouldCreateSuccessfully() {
        BirthDate birthDate = new BirthDate(LocalDate.of(2002, 02, 27));

        Assertions.assertThat(birthDate.value())
                    .isEqualTo(new BirthDate(LocalDate.of(2002, 2, 27)).value());
    }

    @Test
    void given_nullBirthDate_whenCreateBirthDate_shouldGenerateException() {
        Assertions.assertThatExceptionOfType(NullPointerException.class)
                .isThrownBy(() -> new BirthDate(null));
    }

    @Test
    void given_futureBirthDate_whenCreateBirthDate_shouldGenerateException() {
        Assertions.assertThatExceptionOfType(IllegalArgumentException.class)
                .isThrownBy(() -> new BirthDate(LocalDate.of(2026, 10, 01)));
    }

    @Test
    void given_validBirthDate_whenCallToString_shouldReturnFormattedDate() {
        BirthDate birthDate = new BirthDate(LocalDate.of(2002, 2, 27));

        Assertions.assertThat(birthDate.toString())
                .isEqualTo("2002-02-27");
    }
}