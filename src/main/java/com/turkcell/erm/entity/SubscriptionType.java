package com.turkcell.erm.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Entity
@Table(name = "subscription_type")
public class SubscriptionType {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "type_id")
    private Integer id;

    @OneToMany(mappedBy = "subscriptionType")
    private List<Subscription> subscriptionList;

    private String name;
    private String description;

    @Column(name = "is_active")
    private Boolean isActive;

}
