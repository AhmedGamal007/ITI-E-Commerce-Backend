package gov.iti.jets.ecommerce.persistence.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "admin", catalog = "ecommerce")
public class Admin extends User {

    public Admin() {
    }

    public Admin(String userName, String email, String password) {
        super(userName, email, password);
    }

    public Admin(String userName, String email, String password, String phone) {
        super(userName, email, password, phone);
    }

}
