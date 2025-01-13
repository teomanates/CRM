package com.turkcell.erm.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Entity
@Table(name = "product")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "product_id")
    private Integer productId;

    @OneToMany(mappedBy = "product")
    private List<SubscriptionProduct> subscriptionProductList;

    @OneToMany(mappedBy = "product")
    private List<ProductCategory> productCategoryList;

    @OneToMany(mappedBy = "product")
    private List<ProductCampaign> productCampaignList ;

    private String name;
    private Double price;
    private int stockQuantity;

    @Column(name = "is_active")
    private Boolean isActive;

}
