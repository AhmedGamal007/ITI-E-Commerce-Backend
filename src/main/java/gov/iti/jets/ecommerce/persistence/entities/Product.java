package gov.iti.jets.ecommerce.persistence.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import static jakarta.persistence.GenerationType.IDENTITY;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name="product"
    ,catalog="ecommerce"
)
public class Product  implements java.io.Serializable {


     private Integer id;
     private String name;
     private String description;
     private Double price = 0.0;
     private Integer stock = 0;
     private String imagePath;
     private Double rate = 0.0;
     private Set<Category> categories = new HashSet<Category>(0);
     private Set<OrderHasProduct> orderHasProducts = new HashSet<OrderHasProduct>(0);

    public Product() {
    }

	
    public Product(String name) {
        this.name = name;
    }
    public Product(String name, String description, Double price, Integer stock, String imagePath, Double rate, Set<Category> categories, Set<OrderHasProduct> orderHasProducts) {
       this.name = name;
       this.description = description;
       this.price = price;
       this.stock = stock;
       this.imagePath = imagePath;
       this.rate = rate;
       this.categories = categories;
       this.orderHasProducts = orderHasProducts;
    }
   
     @Id @GeneratedValue(strategy=IDENTITY)

    
    @Column(name="id", unique=true, nullable=false)
    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }

    
    @Column(name="name", nullable=false, length=45)
    public String getName() {
        return this.name;
    }
    
    public void setName(String name) {
        this.name = name;
    }

    
    @Column(name="description", length=255)
    public String getDescription() {
        return this.description;
    }
    
    public void setDescription(String description) {
        this.description = description;
    }

    
    @Column(name="price", precision=22, scale=0)
    public Double getPrice() {
        return this.price;
    }
    
    public void setPrice(Double price) {
        this.price = price;
    }

    
    @Column(name="stock")
    public Integer getStock() {
        return this.stock;
    }
    
    public void setStock(Integer stock) {
        this.stock = stock;
    }

    
    @Column(name="image_path", length=255)
    public String getImagePath() {
        return this.imagePath;
    }
    
    public void setImagePath(String imagePath) {
        this.imagePath = imagePath;
    }

    
    @Column(name="rate", precision=22, scale=0)
    public Double getRate() {
        return this.rate;
    }
    
    public void setRate(Double rate) {
        this.rate = rate;
    }

@ManyToMany(fetch=FetchType.LAZY)
    @JoinTable(name="product_has_category", catalog="ecommerce", joinColumns = { 
        @JoinColumn(name="product_id", nullable=false, updatable=false) }, inverseJoinColumns = { 
        @JoinColumn(name="category_id", nullable=false, updatable=false) })
    public Set<Category> getCategories() {
        return this.categories;
    }
    
    public void setCategories(Set<Category> categories) {
        this.categories = categories;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="product")
    public Set<OrderHasProduct> getOrderHasProducts() {
        return this.orderHasProducts;
    }
    
    public void setOrderHasProducts(Set<OrderHasProduct> orderHasProducts) {
        this.orderHasProducts = orderHasProducts;
    }




}


