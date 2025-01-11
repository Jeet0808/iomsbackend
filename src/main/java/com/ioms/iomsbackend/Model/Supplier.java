package com.ioms.iomsbackend.Model;

import jakarta.el.ELManager;
import jakarta.persistence.*;
import org.hibernate.annotations.GenericGenerator;

import java.lang.reflect.GenericArrayType;
import java.security.SecureRandom;
import java.util.List;
import java.util.UUID;

/**
 * The Supplier class handles the product supply to the user, the user can add suppliers and give them
 * Order for a certain amount of products as units.
 *
 * so it basically contains the details of supplies
 */

@Entity
public class Supplier {

    // instance variable

    @Id
    @GeneratedValue(generator = "UUID")
    @Column(columnDefinition = "VARCHAR(36)")
    private UUID supplierId;
    private Long useid;
    private String name;
    private String contactInfo;
    @Column(unique = true)
    private String email;
    private String phone;



    public Supplier(){}
    public Supplier( UUID supplierId, Long useid, String name, String contactInfo, String email, String phone, List<Product> product) {

        this.supplierId = supplierId;
        this.name = name;
        this.contactInfo = contactInfo;
        this.email = email;
        this.phone = phone;
        this.useid = useid;
//        this.product = product;
    }

    // getters and setters

    public Long getUseid() {
        return useid;
    }

    public void setUseid(Long useid) {
        this.useid = useid;
    }

    public UUID getSupplierId() {
        return supplierId;
    }

    public void setSupplierId(UUID supplierId) {
        this.supplierId = supplierId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContactInfo() {
        return contactInfo;
    }

    public void setContactInfo(String contactInfo) {
        this.contactInfo = contactInfo;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

}



//Field Name	Type	Description
//supplierId	UUID	Unique identifier for the supplier.
//name	String	Name of the supplier.
//contactInfo	String	Contact information of the supplier (can include address or other details).
//email	String	Email address of the supplier.
//phone	String	Phone number of the supplier.