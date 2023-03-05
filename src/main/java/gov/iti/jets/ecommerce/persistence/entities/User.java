package gov.iti.jets.ecommerce.persistence.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import static jakarta.persistence.GenerationType.IDENTITY;
import jakarta.persistence.Id;
import jakarta.persistence.Inheritance;
import jakarta.persistence.Table;
import jakarta.persistence.UniqueConstraint;
import jakarta.persistence.InheritanceType;

@Entity
@Table(name = "user", catalog = "ecommerce", uniqueConstraints = { @UniqueConstraint(columnNames = "email"),
        @UniqueConstraint(columnNames = "user_name") })
@Inheritance(strategy = InheritanceType.JOINED)
public abstract class User implements java.io.Serializable {

    private Integer id;
    private String userName;
    private String email;
    private String password;
    private String phone;

    public User() {
    }

    public User(String userName, String email, String password) {
        this.userName = userName;
        this.email = email;
        this.password = password;
    }

    public User(String userName, String email, String password, String phone) {
        this.userName = userName;
        this.email = email;
        this.password = password;
        this.phone = phone;
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

    @Column(name = "user_name", unique = true, nullable = false, length = 45)
    public String getUserName() {
        return this.userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    @Column(name = "email", unique = true, nullable = false, length = 150)
    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Column(name = "password", nullable = false, length = 150)
    public String getPassword() {
        return this.password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Column(name = "phone", length = 20)
    public String getPhone() {
        return this.phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

}
