package com.ecom.product_api.entity;

import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity(name="product_image")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Images {
    @Id
    private String id;
    @Embedded
    private FileResource fileResource;
    @ManyToOne
    @JoinColumn(name="product_id")
    private Product product;
}
