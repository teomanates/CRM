package com.turkcell.erm.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Entity
@Table(name = "complaint_type")
public class ComplaintType {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "type_id")
    private Integer complaintTypeId;

    @OneToMany(mappedBy = "complaintType")
    private List<Complaints> complaintsList;

    private String name;


}
