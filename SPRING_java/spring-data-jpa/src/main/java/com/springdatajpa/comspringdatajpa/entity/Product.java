package com.springdatajpa.comspringdatajpa.entity;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.math.BigDecimal;
import java.time.LocalDateTime;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@ToString
@Table(name = "products",                            //@Table annotation can be used to configure the table details for the product table.
        schema /*Dbalias*/ = "ecommerce",
        uniqueConstraints = {                        // To make column unique ||  this annotation has two attributes, name and column names
                @UniqueConstraint(
                        name = "sku_unique",
                        columnNames = "sku"
                ) /*,(More Columns)*/
        }

)
public class Product {
@Id                                                 //order to map this product deep into to the relational database table, we have also create a pri key
//@GeneratedValue(strategy = GenerationType.IDENTITY)    //this will auto increment
@GeneratedValue(strategy = GenerationType.SEQUENCE,
                    generator = "product_generator"

)     //this will auto increment

@SequenceGenerator(
       name="product_generator", //once given seq we need to add a ref
        sequenceName = "product_sequence_name",
        allocationSize = 1

)
private Long id;

@Column(name="stock_keeping_unit",nullable=false)
private String sku;


/*Hibernate:  OUTPUT
    create table products (
        id bigint not null auto_increment,
        active bit not null,
        date_created datetime(6),
        description varchar(255),
        image_url varchar(255),
        last_updated datetime(6),
        name varchar(255),
        price decimal(38,2),
        stock_keeping_unit varchar(255) not null,
        primary key (id)
    ) engine=InnoDB
Hibernate:
    alter table products
       drop index sku_unique
Hibernate:
    alter table products
       add constraint sku_unique unique (sku)*/


private String name;
private String description;
private BigDecimal price;
private String imageUrl;
private boolean active;

@CreationTimestamp
private LocalDateTime dateCreated;

@UpdateTimestamp
private LocalDateTime lastUpdated;                          //For date things

// For Lombok
//    public Long getId() {
//        return id;
//    }
//
//    public void setId(Long id) {
//        this.id = id;
//    }
//
//    public String getSku() {
//        return sku;
//    }
//
//    public void setSku(String sku) {
//        this.sku = sku;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public String getDescription() {
//        return description;
//    }
//
//    public void setDescription(String description) {
//        this.description = description;
//    }
//
//    public BigDecimal getPrice() {
//        return price;
//    }
//
//    public void setPrice(BigDecimal price) {
//        this.price = price;
//    }
//
//    public String getImageUrl() {
//        return imageUrl;
//    }
//
//    public void setImageUrl(String imageUrl) {
//        this.imageUrl = imageUrl;
//    }
//
//    public boolean isActive() {
//        return active;
//    }
//
//    public void setActive(boolean active) {
//        this.active = active;
//    }
//
//    public LocalDateTime getDateCreated() {
//        return dateCreated;
//    }
//
//    public void setDateCreated(LocalDateTime dateCreated) {
//        this.dateCreated = dateCreated;
//    }
//
//    public LocalDateTime getLastUpdated() {
//        return lastUpdated;
//    }
//
//    public void setLastUpdated(LocalDateTime lastUpdated) {
//        this.lastUpdated = lastUpdated;
//    }
}
