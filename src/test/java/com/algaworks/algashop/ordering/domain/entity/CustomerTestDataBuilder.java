package com.algaworks.algashop.ordering.domain.entity;

import com.algaworks.algashop.ordering.domain.valueobject.*;
import com.algaworks.algashop.ordering.domain.valueobject.id.CustomerId;

import java.time.LocalDate;
import java.time.OffsetDateTime;

public class CustomerTestDataBuilder {
    private CustomerTestDataBuilder() {
    }

    public static Customer.BrandNewCustomerBuild brandNewCustomer() {
        return Customer.brandNew()
                .fullName(new FullName("Matheus", "Amaral"))
                .birthDate(new BirthDate(LocalDate.of(2002, 02, 27)))
                .email(new Email("matheusthierri7@gmail.com"))
                .phone(new Phone("(19)99250-1181"))
                .document(new Document("123456-123"))
                .promotionNotificationsAllowed(false)
                .address(
                        Address.builder()
                                .street("Bourbon Street")
                                .number("1134")
                                .neighborhood("North Ville")
                                .city("York")
                                .state("South California")
                                .zipCode(new ZipCode("12345"))
                                .complement("Apt. 114")
                                .build());
    }

    public static Customer.ExistingCustomerBuild existingCustomer() {
        return Customer.existing()
                .id(new CustomerId())
                .registeredAt(OffsetDateTime.now())
                .promotionNotificationsAllowed(true)
                .archived(false)
                .archivedAt(null)
                .fullName(new FullName("Matheus", "Amaral"))
                .birthDate(new BirthDate(LocalDate.of(2002, 02, 27)))
                .email(new Email("matheusthierri7@gmail.com"))
                .phone(new Phone("(19)99250-1181"))
                .document(new Document("123456-123"))
                .promotionNotificationsAllowed(false)
                .loyaltyPoints(new LoyaltyPoints(0))
                .address(
                        Address.builder()
                                .street("Bourbon Street")
                                .number("1134")
                                .neighborhood("North Ville")
                                .city("York")
                                .state("South California")
                                .zipCode(new ZipCode("12345"))
                                .complement("Apt. 114")
                                .build());
    }

    public static Customer.ExistingCustomerBuild existingAnonymizedCustomer() {
        return Customer.existing()
                .id(new CustomerId())
                .fullName(new FullName("Anonymous", "Anonymous"))
                .birthDate(null)
                .email(new Email("anonymous@anonymous.com"))
                .phone(new Phone("000-000-0000"))
                .document(new Document("000-00-0000"))
                .promotionNotificationsAllowed(false)
                .archived(true)
                .registeredAt(OffsetDateTime.now())
                .archivedAt(OffsetDateTime.now())
                .loyaltyPoints(new LoyaltyPoints(10))
                .address(
                        Address.builder()
                                .street("Bourbon Street")
                                .number("Anoymized")
                                .neighborhood("North Ville")
                                .city("York")
                                .state("South California")
                                .zipCode(new ZipCode("12345"))
                                .complement(null)
                                .build());
    }
}
