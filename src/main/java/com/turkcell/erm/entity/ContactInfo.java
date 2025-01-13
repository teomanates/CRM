package com.turkcell.erm.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "contact_info")
public class ContactInfo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "contact_id")
    private Integer contactId; //başta null olabilir

    @ManyToOne
    @JoinColumn(name = "customer_id")
    private Customer customer;

    private String phone;
    private String email;
    private String address;
    private String city;

    @Column(name = "is_active")
    private String isActive;
}
