package com.algaworks.algashop.ordering.domain.valueobject;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FullNameTest {
    @Test
    void given_validFirstName_whenCreateFullname_shouldCreateSuccessfully() {
        FullName fullName = new FullName("Matheus", "Amaral");

        Assertions.assertThat(fullName.firstName())
                .isEqualTo(new FullName("Matheus", "Amaral").firstName());
    }

    @Test
    void given_nullFirstName_whenCreateFullname_shouldGenerateException() {
        Assertions.assertThatExceptionOfType(NullPointerException.class)
                .isThrownBy(() -> new FullName(null, "Amaral"));
    }

    @Test
    void given_blankFirstName_whenCreateFullname_shouldGenerateException() {
        Assertions.assertThatExceptionOfType(IllegalArgumentException.class)
                .isThrownBy(() -> new FullName("Matheus", ""));
    }

    @Test
    void given_validLastName_whenCreateFullname_shouldCreateSuccessfully() {
        FullName fullName = new FullName("Matheus", "Amaral");

        Assertions.assertThat(fullName.lastName())
                .isEqualTo(new FullName("Matheus", "Amaral").lastName());
    }

    @Test
    void given_nullLastName_whenCreateFullname_shouldGenerateException() {
        Assertions.assertThatExceptionOfType(NullPointerException.class)
                .isThrownBy(() -> new FullName("Matheus", null));
    }

    @Test
    void given_blankLastName_whenCreateFullname_shouldGenerateException() {
        Assertions.assertThatExceptionOfType(IllegalArgumentException.class)
                .isThrownBy(() -> new FullName("Matheus", ""));
    }

    @Test
    void given_validFullname_whenCallToString_shouldReturnFullname() {
        FullName fullName = new FullName("Matheus", "Amaral");

        Assertions.assertThat(fullName.toString())
                .isEqualTo("Matheus Amaral");
    }
}