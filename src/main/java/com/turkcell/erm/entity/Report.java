package com.turkcell.erm.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "report")
public class Report {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "report_id")
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private SystemUser systemUser;

    @ManyToOne
    @JoinColumn(name = "type_id")
    private ReportType reportType;

    @Column(name = "income_report")
    private String incomeReport;

    @Column(name = "support_solution_report")
    private String supportSolutionReport;

    @Column(name = "customer_satisfaction_rate")
    private String customerSatisfactionRate;


}
