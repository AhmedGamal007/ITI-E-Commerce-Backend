package gov.iti.jets.ecommerce.persistence.entities;

import jakarta.persistence.AttributeOverride;
import jakarta.persistence.AttributeOverrides;
import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "order_has_product", catalog = "ecommerce")
@Data
public class OrderHasProduct implements java.io.Serializable {

    private OrderHasProductId id;
    private Product product;
    private Orders orders;
    private Integer amount = 0;

    public OrderHasProduct() {
    }

    public OrderHasProduct(OrderHasProductId id, Product product, Orders orders) {
        this.id = id;
        this.product = product;
        this.orders = orders;
    }

    public OrderHasProduct(OrderHasProductId id, Product product, Orders orders, Integer amount) {
        this.id = id;
        this.product = product;
        this.orders = orders;
        this.amount = amount;
    }

    @EmbeddedId

    @AttributeOverrides({
            @AttributeOverride(name = "orderId", column = @Column(name = "order_id", nullable = false)),
            @AttributeOverride(name = "productId", column = @Column(name = "product_id", nullable = false)) })
    public OrderHasProductId getId() {
        return this.id;
    }

    public void setId(OrderHasProductId id) {
        this.id = id;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "product_id", nullable = false, insertable = false, updatable = false)
    public Product getProduct() {
        return this.product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "order_id", nullable = false, insertable = false, updatable = false)
    public Orders getOrders() {
        return this.orders;
    }

    public void setOrders(Orders orders) {
        this.orders = orders;
    }

    @Column(name = "amount")
    public Integer getAmount() {
        return this.amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

}
