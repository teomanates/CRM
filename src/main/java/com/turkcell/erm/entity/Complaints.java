package com.turkcell.erm.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "complaints")
public class Complaints {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "complaints_id")
    private Integer complaintsId;

    @ManyToOne
    @JoinColumn(name = "customer_id")
    private Customer customer;

    @ManyToOne
    @JoinColumn(name = "type_id")
    private ComplaintType complaintType;

    @ManyToOne
    @JoinColumn(name = "status_id")
    private ComplaintStatus complaintStatus;

    private String actions;



}
