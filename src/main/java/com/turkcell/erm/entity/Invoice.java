package com.turkcell.erm.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.util.List;

@Getter
@Setter
@Entity
@Table(name = "invoice")
public class Invoice {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "invoice_id")
    private Integer invoice_id;

    @OneToMany(mappedBy = "invoice")
    private List<Payment> paymentList;

    @OneToOne
    @JoinColumn(name = "subscription_id")
    private Subscription subscription;

    @Column(name = "invoice_date")
    private LocalDate invoiceDate;

    @Column(name = "payment_status")
    private String paymentStatus;

    @Column(name = "late_fee")
    private Double lateFee;
    private Double discount;
    private Double amount;
}
