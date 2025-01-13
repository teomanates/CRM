package com.turkcell.erm.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Entity
@Table(name = "complaint_status")
public class ComplaintStatus {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        @Column(name = "status_id")
        private Integer complaintStatusId;

        @OneToMany(mappedBy = "complaintStatus")
        private List<Complaints> complaintsList;

        private String description;


    }


