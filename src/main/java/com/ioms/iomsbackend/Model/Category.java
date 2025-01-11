package com.ioms.iomsbackend.Model;

import jakarta.persistence.*;
import org.hibernate.annotations.GenericGenerator;

import java.util.UUID;

/**
 * The Category class handles the feature to add new category dynamically
 * for users to maintain their products in a particulate category for fast tracking
 */

@Entity
public class Category {
    @Id
    @GeneratedValue(generator = "UUID")
    @GenericGenerator(
            name = "UUID",
            strategy = "org.hibernate.id.UUIDGenerator"
    )
    @Column(columnDefinition = "VARCHAR(36)")
    private UUID categoryId;
    private String name;
    private String description;
    // constructors
    public Category(){}
    public Category( String name, String description, UUID categoryId) {

        this.name = name;
        this.description = description;
        this.categoryId = categoryId;
    }

    public UUID getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(UUID categoryId) {
        this.categoryId = categoryId;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}

//
//Field Name	Type	Description
//categoryId	UUID	Unique identifier for the category.
//name	String	Name of the category.
//description	String	Description or notes about the category (optional).