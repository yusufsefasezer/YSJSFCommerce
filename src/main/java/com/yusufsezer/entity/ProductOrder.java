package com.yusufsezer.entity;

import com.yusufsezer.contract.BaseEntity;
import com.yusufsezer.enumeration.OrderStatus;
import java.io.Serializable;
import java.math.BigDecimal;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToOne;

@Entity
public class ProductOrder extends BaseEntity implements Serializable {

    private static final long serialVersionUID = 1L;

    @OneToOne
    private Product product;

    @OneToOne
    private User user;
    private int quantity;
    @Column(precision = 8, scale = 2)
    private BigDecimal price;
    private OrderStatus status;

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public OrderStatus getStatus() {
        return status;
    }

    public void setStatus(OrderStatus status) {
        this.status = status;
    }

}
