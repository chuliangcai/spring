package com.bashir.spring.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.TableGenerator;

@Getter
@Setter
@Entity
@NoArgsConstructor
public class Product {
    @Id
    @GeneratedValue(generator = "ProductGenerator")
    @TableGenerator(name = "ProductGenerator", table = "hibernate_sequence", pkColumnValue = "product_id", allocationSize = 100)
    private Long id;

    private String name;

    private int num;

    public Product(String name, int num) {
        this.name = name;
        this.num = num;
    }
}
