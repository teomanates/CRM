package com.turkcell.erm.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Entity
@Table(name = "user_role")
public class UserRole {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "role_id")
    private Integer roleId;

    @OneToMany(mappedBy = "userRole")
    private List<SystemUser> userRoleList;

    private int permissionLevel;
    private String roleName;

    @Column(name = "is_active")
    private Boolean isActive;
}
