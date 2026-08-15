package com.algaworks.algashop.ordering.domain.valueobject;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class DocumentTest {
    @Test
    void given_validDocument_whenCreateDocument_shouldCreateSuccessfully() {
        Document document = new Document("123456-123");

        Assertions.assertThat(document.value())
                .isEqualTo(new Document("123456-123").value());
    }

    @Test
    void given_nullDocument_whenCreateDocument_shouldGenerateException() {
        Assertions.assertThatExceptionOfType(NullPointerException.class)
                .isThrownBy(() -> new Document(null));
    }

    @Test
    void given_blankDocument_whenCreateDocument_shouldGenerateException() {
        Assertions.assertThatExceptionOfType(IllegalArgumentException.class)
                .isThrownBy(() -> new Document(""));
    }

    @Test
    void given_validDocument_whenCallToString_shouldReturnDocument() {
        Document document = new Document("123456-123");

        Assertions.assertThat(document.toString())
                .isEqualTo("123456-123");
    }
}