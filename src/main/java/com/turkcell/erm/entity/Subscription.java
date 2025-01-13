package com.turkcell.erm.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.util.List;

@Getter
@Setter
@Entity
@Table(name = "subscription")
public class Subscription {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "subscription_id")
    private Integer subscriptionId;

    @ManyToOne
    @JoinColumn(name = "customer_id")
    private Customer customer;

    @ManyToOne
    @JoinColumn(name = "type_id")
    private SubscriptionType subscriptionType;

    @OneToMany(mappedBy = "subscription")
    private List<SubscriptionProduct> subscriptionProductList;

    @OneToOne(mappedBy = "subscription")
    private Invoice invoice;

    @Column(name = "start_date")
    private LocalDate startDate;

    @Column(name = "end_date")
    private LocalDate endDate;

    @Column(name = "invoice_cycle")
    private String invoiceCycle;

    @Column(name = "is_active")
    private Boolean isActive;
}
