package com.turkcell.erm.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.w3c.dom.Text;

import java.time.LocalDate;
import java.util.List;

@Getter
@Setter
@Entity
@Table(name = "campaign")
public class Campaign {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "campaign_id")
    private int campaign_id;

    @OneToMany(mappedBy = "campaign")
    private List<ProductCampaign> productCampaignList;

    @OneToMany(mappedBy = "campaign")
    private List<CustomerCampaign> customerCampaignList;

    private String campaign_name;
    private String description;

    @Column(name = "performance_indicator")
    private String performanceIndicator;

    @Column(name = "start_date")
    private LocalDate startDate;

    @Column(name = "end_date")
    private LocalDate endDate;

    @Column(name = "is_active")
    private Boolean isActive;

}
