package com.turkcell.erm.entity;

import jakarta.persistence.*;
import jdk.jshell.JShell;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Entity
@Table(name = "customer")
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "customer_id")
    private Integer customerId;

    @ManyToOne
    @JoinColumn(name = "type_id")
    private CustomerType customerType;

    @ManyToOne
    @JoinColumn(name = "segment_id")
    private CustomerSegment customerSegment;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "tax_number")
    private String taxNumber;

    @Column(name = "national_id")
    private String nationalId;

    @OneToMany(mappedBy = "customer")
    private List<ContactInfo> contactInfoList;

    @OneToMany(mappedBy = "customer")
    private List<Subscription> subscriptionList;

    @OneToMany(mappedBy = "customer")
    private List<SupportRequest> supportRequestList;

    @OneToMany(mappedBy = "customer")
    private List<Notification> notificationList;

    @OneToMany(mappedBy = "customer")
    private List<Feedback> feedbackList;

    @OneToMany(mappedBy = "customer")
    private List<CustomerCampaign> customerCampaignList;

}

