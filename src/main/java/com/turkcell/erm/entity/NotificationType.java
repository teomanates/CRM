package com.turkcell.erm.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Entity
@Table(name = "notification_type")
public class NotificationType {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "type_id")
    private Integer typeId;

    @OneToMany(mappedBy = "notificationType")
    private List<Notification> notificationList;

    private String name;
    private String description;

    @Column(name = "is_active")
    private Boolean isActive;
}
