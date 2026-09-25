package com.algaworks.algashop.ordering.domain.entity;

import com.algaworks.algashop.ordering.domain.valueobject.BillingInfo;
import com.algaworks.algashop.ordering.domain.valueobject.Money;
import com.algaworks.algashop.ordering.domain.valueobject.Quantity;
import com.algaworks.algashop.ordering.domain.valueobject.ShippingInfo;
import com.algaworks.algashop.ordering.domain.valueobject.id.CustomerId;
import com.algaworks.algashop.ordering.domain.valueobject.id.OrderId;

import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.Objects;
import java.util.Set;

public class Order {
    private OrderId id;
    private CustomerId customerId;

    private Money totalAmount;
    private Quantity totalItems;

    private OffsetDateTime placedAt;
    private OffsetDateTime paidAt;
    private OffsetDateTime canceledAt;
    private OffsetDateTime readyAt;

    private BillingInfo billing;
    private ShippingInfo shipping;

    private OrderStatus status;
    private PaymentMethod paymentMethod;

    private Money shippingCost;
    private LocalDate expectedDeliveryDate;

    private Set<OrderItem> items;

    public Order(OrderId id, CustomerId customerId, Money totalAmount, OffsetDateTime placedAt,
                 Quantity totalItems, OffsetDateTime paidAt, OffsetDateTime readyAt,
                 OffsetDateTime canceledAt, BillingInfo billing, ShippingInfo shipping,
                 OrderStatus status, Money shippingCost, PaymentMethod paymentMethod, LocalDate expectedDeliveryDate,
                 Set<OrderItem> items) {
        this.setId(id);
        this.setCustomerId(customerId);
        this.setTotalAmount(totalAmount);
        this.setPlacedAt(placedAt);
        this.setTotalItems(totalItems);
        this.setPaidAt(paidAt);
        this.setReadyAt(readyAt);
        this.setCanceledAt(canceledAt);
        this.setBilling(billing);
        this.setShipping(shipping);
        this.setStatus(status);
        this.setShippingCost(shippingCost);
        this.setPaymentMethod(paymentMethod);
        this.setExpectedDeliveryDate(expectedDeliveryDate);
        this.setItems(items);
    }

    public Order(OrderId id) {
        this.id = id;
    }

    public OrderId id() {
        return id;
    }

    public CustomerId customerId() {
        return customerId;
    }

    public Money totalAmount() {
        return totalAmount;
    }

    public Quantity totalItems() {
        return totalItems;
    }

    public OffsetDateTime placedAt() {
        return placedAt;
    }

    public OffsetDateTime paidAt() {
        return paidAt;
    }

    public OffsetDateTime canceledAt() {
        return canceledAt;
    }

    public OffsetDateTime readyAt() {
        return readyAt;
    }

    public BillingInfo billing() {
        return billing;
    }

    public ShippingInfo shipping() {
        return shipping;
    }

    public OrderStatus status() {
        return status;
    }

    public PaymentMethod paymentMethod() {
        return paymentMethod;
    }

    public Money shippingCost() {
        return shippingCost;
    }

    public LocalDate expectedDeliveryDate() {
        return expectedDeliveryDate;
    }

    public Set<OrderItem> items() {
        return items;
    }

    public void setCustomerId(CustomerId customerId) {
        Objects.requireNonNull(customerId);
        this.customerId = customerId;
    }

    public void setId(OrderId id) {
        Objects.requireNonNull(id);
        this.id = id;
    }

    public void setTotalAmount(Money totalAmount) {
        Objects.requireNonNull(totalAmount);
        this.totalAmount = totalAmount;
    }

    public void setTotalItems(Quantity totalItems) {
        Objects.requireNonNull(totalItems);
        this.totalItems = totalItems;
    }

    public void setCanceledAt(OffsetDateTime canceledAt) {
        this.canceledAt = canceledAt;
    }

    public void setPlacedAt(OffsetDateTime placedAt) {
        this.placedAt = placedAt;
    }

    public void setPaidAt(OffsetDateTime paidAt) {
        this.paidAt = paidAt;
    }

    public void setBilling(BillingInfo billing) {
        Objects.requireNonNull(billing);
        this.billing = billing;
    }

    public void setShipping(ShippingInfo shipping) {
        Objects.requireNonNull(shipping);
        this.shipping = shipping;
    }

    public void setReadyAt(OffsetDateTime readyAt) {
        this.readyAt = readyAt;
    }

    public void setStatus(OrderStatus status) {
        Objects.requireNonNull(status);
        this.status = status;
    }

    public void setPaymentMethod(PaymentMethod paymentMethod) {
        Objects.requireNonNull(paymentMethod);
        this.paymentMethod = paymentMethod;
    }

    public void setShippingCost(Money shippingCost) {
        this.shippingCost = shippingCost;
    }

    public void setExpectedDeliveryDate(LocalDate expectedDeliveryDate) {
        this.expectedDeliveryDate = expectedDeliveryDate;
    }

    public void setItems(Set<OrderItem> items) {
        Objects.requireNonNull(items);
        this.items = items;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Order order = (Order) o;
        return Objects.equals(id, order.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }
}
