package com.algaworks.algashop.ordering.domain.valueobject;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PhoneTest {
    @Test
    void given_validPhone_whenCreatePhone_shouldCreateSuccessfully() {
        Phone phone = new Phone("123-123-1234");

        Assertions.assertThat(phone.value())
                .isEqualTo(new Phone("123-123-1234").value());
    }

    @Test
    void given_nullPhone_whenCreatePhone_shouldGenerateException() {
        Assertions.assertThatExceptionOfType(NullPointerException.class)
                .isThrownBy(() -> new Phone(null));
    }

    @Test
    void given_blankPhone_whenCreatePhone_shouldGenerateException() {
        Assertions.assertThatExceptionOfType(IllegalArgumentException.class)
                .isThrownBy(() -> new Phone(""));
    }

    @Test
    void given_validDPhone_whenCallToString_shouldReturnPhone() {
        Phone phone = new Phone("123-123-1234");

        Assertions.assertThat(phone.toString())
                .isEqualTo("123-123-1234");
    }
}