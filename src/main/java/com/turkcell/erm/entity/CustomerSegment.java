package com.turkcell.erm.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "customer_segment")
public class CustomerSegment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "segment_id")
    private Integer segmentId;

    @Column(name = "name")
    private String name;

    @Column(name = "description")
    private String description;

    @Column(name = "min_spending")
    private int minSpending;
}
