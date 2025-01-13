package com.turkcell.erm.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@Entity
@Table(name = "system_user")
public class SystemUser {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_id")
    private Integer userId;

    @OneToMany(mappedBy = "systemUser")
    private List<SupportRequest> supportRequestsList;

    @OneToMany(mappedBy = "systemUser")
    private List<Report> reportList;

    @ManyToOne
    @JoinColumn(name = "role_id")
    private UserRole userRole;

    private String username;
    private String password;
    private String email;

    @Column(name = "last_login")
    private LocalDate lastLogin;

    @Column(name = "is_active")
    private Boolean isActive;
}
