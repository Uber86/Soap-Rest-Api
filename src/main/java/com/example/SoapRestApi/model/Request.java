package com.example.SoapRestApi.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.time.LocalDateTime;
import java.util.List;

@Entity
public class Request {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String requestIdPortal;

    private String requestIdEPGU;

    private String branchIdPortal;

    private LocalDateTime requestCreatedDateTime;

    private String clientIdPortal;

    private String clientTypeId;

    private String clientINN;

    private String clientPhone;

    private String clientEmail;

    private String regionId;

    private String branchId;

    private String requestTypeId;

    private String requestVersion;

    private LocalDateTime requestChangeDate;

    private List<Attributes> attributesList;
}
