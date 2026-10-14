package com.algaworks.algashop.ordering.domain.entity;

import com.algaworks.algashop.ordering.domain.valueobject.Money;
import com.algaworks.algashop.ordering.domain.valueobject.Product;
import com.algaworks.algashop.ordering.domain.valueobject.ProductName;
import com.algaworks.algashop.ordering.domain.valueobject.Quantity;
import com.algaworks.algashop.ordering.domain.valueobject.id.OrderId;
import com.algaworks.algashop.ordering.domain.valueobject.id.OrderItemId;
import com.algaworks.algashop.ordering.domain.valueobject.id.ProductId;
import lombok.Builder;

import java.util.Objects;

public class OrderItem {
    private OrderItemId id;
    private OrderId orderId;

    private ProductId productId;
    private ProductName productName;

    private Money price;
    private Quantity quantity;

    private Money totalAmount;

    @Builder(builderClassName = "ExistingOrderItemBuilder", builderMethodName = "existing")
    public OrderItem(OrderItemId id, OrderId orderId, ProductId productId,
                     ProductName productName, Money price, Quantity quantity,
                     Money totalAmount
                     ) {
        this.setId(id);
        this.setOrderId(orderId);
        this.setProductName(productName);
        this.setProductId(productId);
        this.setPrice(price);
        this.setTotalAmount(totalAmount);
        this.setQuantity(quantity);
    }

    @Builder(builderClassName = "BrandNewOrderItemBuilder", builderMethodName = "brandNew")
    private static OrderItem createBrandNew(OrderId orderId, Product product, Quantity quantity) {
        Objects.requireNonNull(product);
        Objects.requireNonNull(orderId);
        Objects.requireNonNull(quantity);

        OrderItem orderItem = new OrderItem(
                new OrderItemId(),
                orderId,
                product.id(),
                product.name(),
                product.price(),
                quantity,
                Money.ZERO
        );

        orderItem.recalculateTotals();

        return orderItem;
    };

     void changeQuantity(Quantity quantity) {
        Objects.requireNonNull(quantity);

        this.setQuantity(quantity);
        this.recalculateTotals();
    }

    public OrderItemId id() {
        return id;
    }

    public OrderId orderId() {
        return orderId;
    }

    public ProductId productId() {
        return productId;
    }

    public ProductName productName() {
        return productName;
    }

    public Quantity quantity() {
        return quantity;
    }

    public Money price() {
        return price;
    }

    public Money totalAmount() {
        return totalAmount;
    }

    private void recalculateTotals() {
        this.setTotalAmount(this.price().multiply(this.quantity()));
    }

    public void setId(OrderItemId id) {
        Objects.requireNonNull(id);
        this.id = id;
    }

    public void setOrderId(OrderId orderId) {
        Objects.requireNonNull(orderId);
        this.orderId = orderId;
    }

    public void setProductId(ProductId productId) {
        Objects.requireNonNull(productId);
        this.productId = productId;
    }

    public void setProductName(ProductName productName) {
        Objects.requireNonNull(productName);
        this.productName = productName;
    }

    public void setPrice(Money price) {
        Objects.requireNonNull(price);
        this.price = price;
    }

    public void setQuantity(Quantity quantity) {
        Objects.requireNonNull(quantity);
        this.quantity = quantity;
    }

    public void setTotalAmount(Money totalAmount) {
        Objects.requireNonNull(totalAmount);
        this.totalAmount = totalAmount;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        OrderItem orderItem = (OrderItem) o;
        return Objects.equals(id, orderItem.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }
}
