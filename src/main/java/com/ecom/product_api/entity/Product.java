package com.ecom.product_api.entity;

import java.util.Set;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity(name="product")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Product {
    @Id
    @Column(name="product_id", length=80, nullable=false)
    private String productId;
    @Column(name="description", length=1000)
    private String description;
    @Column(name="unit_price", precision=2)
    private double unitPrice;
    @Column(name="qty", nullable=false)
    private int qty;
    @OneToMany(mappedBy="product", fetch=FetchType.EAGER, cascade=CascadeType.ALL)
    private Set<Images> images;
}
