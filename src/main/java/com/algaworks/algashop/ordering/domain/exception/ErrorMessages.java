package com.algaworks.algashop.ordering.domain.exception;

public class ErrorMessages {
    public static final String VALIDATION_ERROR_EMAIL_IS_INVALID = "E-mail is invalid";
    public static final String VALIDATION_ERROR_BIRTHDATE_MUST_IN_PAST = "BirthDate must be a past date";
    public static final String VALIDATION_ERROR_FIRSTNAME_IS_NULL = "First name cannot be null";
    public static final String VALIDATION_ERROR_LASTNAME_IS_NULL = "Last name cannot be null";
    public static final String VALIDATION_ERROR_FIRSTNAME_IS_BLANK = "First name cannot be blank";
    public static final String VALIDATION_ERROR_LASTNAME_IS_BLANK = "Last name cannot be blank";
    public static final String ERROR_CUSTOMER_ARCHIVED = "Customer is archived it cannot  be changed";
    public static final String VALIDATION_ERROR_BIRTHDATE_IS_NULL = "Birthdate cannot be null";
    public static final String VALIDATION_ERROR_DOCUMENT_IS_NULL = "Document cannot be null";
    public static final String VALIDATION_ERROR_DOCUMENT_IS_BLANK = "Document cannot be blank";
    public static final String VALIDATION_ERROR_PHONE_IS_NULL = "Phone cannot be null";
    public static final String VALIDATION_ERROR_PHONE_IS_BLANK = "Phone cannot be blank";
    public static final String ERROR_ORDER_STATUS_CANNOT_BE_CHANGED = "Cannot change order %s status from %s to %s";
    public static final String ERROR_ORDER_DELIVERY_DATE_CANNOT_BE_IN_THE_PAST = "Order %s expected delivery date cannot be in the past";
    public static final String ERROR_ORDER_CANNOT_BE_PLACED_HAS_NOT_ITEMS = "Order %s cannot be closed, it has no items";
    public static final String ERROR_ORDER_CANNOT_BE_PLACED_HAS_NO_SHIPPING_INFO
            = "Order %s cannot be placed, it has no shipping info";

    public static final String ERROR_ORDER_CANNOT_BE_PLACED_HAS_NO_BILLING_INFO
            = "Order %s cannot be placed, it has no billing info";

    public static final String ERROR_ORDER_CANNOT_BE_PLACED_HAS_NO_PAYMENT_METHOD
            = "Order %s cannot be placed, it has no payment method";

    public static final String ERROR_ORDER_DOES_NOT_CONTAIN_ITEM
            = "Order %s does not contain item %s";

    public static final String ERROR_PRODUCT_IS_OUT_OF_STOCK
            = "Product %s is out of stock";
}
