package com.ioms.iomsbackend.Model;

import jakarta.persistence.*;

import java.math.BigDecimal;
import java.util.List;
import java.util.UUID;

/**
 * The Product class is responsible to provide instance variables by
 * getters and setters methods and constructor to initialize product object
 *
 * <p>
 *     The product creation is handled by ProductService layer
 * </p>
 *
 * @author [Jeet]
 * @version 1.0
 * @since 2025-01-06
 */


 /**
 *  Product class instance variables:
 */



@Entity
//@Table(name = "Product")
public class Product {

             // ids
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long productId;
        private Long productOwnerId;
        private UUID suplierId;

        private UUID categoryId;

            // primary details
       private String name;
       private  String SKU;
       private BigDecimal price;

       private Integer quantityInStock;
       private String status;

        // secoundary details
        private String description;
       private Integer reorderLevel;
       private String imageUrl;
       private String brand;
       private double weight;
       private String dimensions;
       private String color;
       private List<String> tags;

       // unParameterize constructor
         public Product(){

         }
       // Parameterize Constructor

     public Product(Long productId, Long productOwnerId, UUID suplierId, String name, String SKU, BigDecimal price, String description, Integer quantityInStock, UUID categoryId, Integer reorderLevel, String status, String imageUrl, String brand, double weight, String dimensions, String color, List<String> tags) {
         this.productId = productId;
         this.productOwnerId = productOwnerId;
         this.suplierId = suplierId;
         this.name = name;
         this.SKU = SKU;
         this.price = price;
         this.description = description;
         this.quantityInStock = quantityInStock;
         this.categoryId = categoryId;
         this.reorderLevel = reorderLevel;
         this.status = status;
         this.imageUrl = imageUrl;
         this.brand = brand;
         this.weight = weight;
         this.dimensions = dimensions;
         this.color = color;
         this.tags = tags;
     }

     // Getters and setters

     public UUID getSuplierId() {
         return suplierId;
     }

     public void setSuplierId(UUID suplierId) {
         this.suplierId = suplierId;
     }

     public List<String> getTags() {
         return tags;
     }

     public void setTags(List<String> tags) {
         this.tags = tags;
     }

     public Long getProductOwnerId() {
         return productOwnerId;
     }

     public void setProductOwnerId(Long productOwnerId) {
         this.productOwnerId = productOwnerId;
     }


        public Long getProductId() {
                return productId;
        }

        public void setProductId(Long productId) {
                this.productId = productId;
        }

        public String getName() {
                return name;
        }

        public void setName(String name) {
                this.name = name;
        }

        public String getSKU() {
                return SKU;
        }

        public void setSKU(String SKU) {
                this.SKU = SKU;
        }

        public BigDecimal getPrice() {
                return price;
        }

        public void setPrice(BigDecimal price) {
                this.price = price;
        }

        public String getDescription() {
                return description;
        }

        public void setDescription(String description) {
                this.description = description;
        }

        public Integer getQuantityInStock() {
                return quantityInStock;
        }

        public void setQuantityInStock(Integer quantityInStock) {
                this.quantityInStock = quantityInStock;
        }

        public UUID getCategoryId() {
                return categoryId;
        }

        public void setCategoryId(UUID categoryId) {
                this.categoryId = categoryId;
        }

        public Integer getReorderLevel() {
                return reorderLevel;
        }

        public void setReorderLevel(Integer reorderLevel) {
                this.reorderLevel = reorderLevel;
        }

        public String getStatus() {
                return status;
        }

        public void setStatus(String status) {
                this.status = status;
        }

        public String getImageUrl() {
                return imageUrl;
        }

        public void setImageUrl(String imageUrl) {
                this.imageUrl = imageUrl;
        }

        public String getBrand() {
                return brand;
        }

        public void setBrand(String brand) {
                this.brand = brand;
        }

        public double getWeight() {
                return weight;
        }

        public void setWeight(double weight) {
                this.weight = weight;
        }

        public String getDimensions() {
                return dimensions;
        }

        public void setDimensions(String dimensions) {
                this.dimensions = dimensions;
        }

        public String getColor() {
                return color;
        }

        public void setColor(String color) {
                this.color = color;
        }



}


//
// Field Name	Type	Description
// productId	Long	Unique identifier for each product.
// name	String	Name of the product.
// SKU	String	Stock Keeping Unit, a unique identifier assigned to each product variation.
// price	BigDecimal	Price of the product.
// description	String	Brief description of the product.
// quantityInStock	Integer	Quantity of the product available in stock.
// categoryId	Long	Identifier for the product's category. Links to a Category entity.
// reorderLevel	Integer	Threshold stock level at which new stock should be ordered.
// status	String	Status of the product, e.g., "active," "discontinued."
// imageUrl	String	URL link to the product image.
// brand	String	Brand name of the product.
// weight	Double	Weight of the product, typically in kilograms or pounds.
// dimensions	String	Dimensions of the product, e.g., "10x20x5 cm."
// color	String	Primary color of the product, if applicable.
// supplierId	Long	Identifier for the supplier providing the product. Links to a Supplier entity.
// tags	List\<String\>	List of keywords or tags associated with the product, useful for search and categorization.
