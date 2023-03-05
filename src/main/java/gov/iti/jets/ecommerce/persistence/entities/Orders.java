package gov.iti.jets.ecommerce.persistence.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import static jakarta.persistence.GenerationType.IDENTITY;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import java.sql.Timestamp;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "orders", catalog = "ecommerce")
public class Orders implements java.io.Serializable {

    private Integer id;
    private Customer customer;
    private Address address;
    private Double totalPrice = 0.0;
    private Boolean isSubmitted = false;
    private String paymentType;
    private Timestamp submitDate;
    private Set<OrderHasProduct> orderHasProducts = new HashSet<OrderHasProduct>(0);

    public Orders() {
    }

    public Orders(Customer customer) {
        this.customer = customer;
    }

    public Orders(Customer customer, Address address, Double totalPrice, Boolean isSubmitted, String paymentType,
            Timestamp submitDate, Set<OrderHasProduct> orderHasProducts) {
        this.customer = customer;
        this.address = address;
        this.totalPrice = totalPrice;
        this.isSubmitted = isSubmitted;
        this.paymentType = paymentType;
        this.submitDate = submitDate;
        this.orderHasProducts = orderHasProducts;
    }

    @Id
    @GeneratedValue(strategy = IDENTITY)

    @Column(name = "id", unique = true, nullable = false)
    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "cust_id", nullable = false)
    public Customer getCustomer() {
        return this.customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "adress_id")
    public Address getAddress() {
        return this.address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    @Column(name = "total_price", precision = 22, scale = 0)
    public Double getTotalPrice() {
        return this.totalPrice;
    }

    public void setTotalPrice(Double totalPrice) {
        this.totalPrice = totalPrice;
    }

    @Column(name = "is_submitted")
    public Boolean getIsSubmitted() {
        return this.isSubmitted;
    }

    public void setIsSubmitted(Boolean isSubmitted) {
        this.isSubmitted = isSubmitted;
    }

    @Column(name = "payment_type", length = 45)
    public String getPaymentType() {
        return this.paymentType;
    }

    public void setPaymentType(String paymentType) {
        this.paymentType = paymentType;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "submit_date", length = 19)
    public Timestamp getSubmitDate() {
        return this.submitDate;
    }

    public void setSubmitDate(Timestamp submitDate) {
        this.submitDate = submitDate;
    }

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "orders")
    public Set<OrderHasProduct> getOrderHasProducts() {
        return this.orderHasProducts;
    }

    public void setOrderHasProducts(Set<OrderHasProduct> orderHasProducts) {
        this.orderHasProducts = orderHasProducts;
    }

}
