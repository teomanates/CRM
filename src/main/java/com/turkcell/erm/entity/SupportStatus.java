package com.turkcell.erm.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Entity
@Table(name = "support_status")
public class SupportStatus {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "status_id")
    private Integer statusId;

    @OneToMany(mappedBy = "supportStatus")
    private List<SupportRequest> supportRequestList;

    private String description;

    @Column(name = "is_active")
    private Boolean isActive;
}
