package com.algaworks.algashop.ordering.domain.valueobject;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class EmailTest {
    @Test
    void given_validEmail_whenCreateEmail_shouldCreateSuccessfully() {
        Email email = new Email("matheusthierri7@gmail.com");

        Assertions.assertThat(email.value())
                .isEqualTo(new Email("matheusthierri7@gmail.com").value());
    }

    @Test
    void given_invalidDocument_whenCreateDocument_shouldGenerateException() {
        Assertions.assertThatExceptionOfType(IllegalArgumentException.class)
                .isThrownBy(() -> new Email("invalid"));
    }

    @Test
    void given_validEmail_whenCallToString_shouldReturnEmail() {
        Email email = new Email("matheusthierri7@gmail.com");

        Assertions.assertThat(email.toString())
                .isEqualTo("matheusthierri7@gmail.com");
    }
}