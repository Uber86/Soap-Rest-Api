package com.example.SoapRestApi.model;

import jakarta.persistence.*;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Objects;

/**
 * Класс Request, информационный класс содержащий информацию о лице, запрашиваемых
 * действиях и информацию о подключаемом оборудовании
 */
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

    @OneToOne(mappedBy = "request", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Attribute> attributeList;


    public Request() {
    }

    public Request(Long id, String requestIdPortal,
                   String requestIdEPGU, String branchIdPortal,
                   LocalDateTime requestCreatedDateTime, String clientIdPortal,
                   String clientTypeId, String clientINN, String clientPhone,
                   String clientEmail, String regionId, String branchId,
                   String requestTypeId, String requestVersion,
                   LocalDateTime requestChangeDate, List<Attribute> attributeList) {
        this.id = id;
        this.requestIdPortal = requestIdPortal;
        this.requestIdEPGU = requestIdEPGU;
        this.branchIdPortal = branchIdPortal;
        this.requestCreatedDateTime = requestCreatedDateTime;
        this.clientIdPortal = clientIdPortal;
        this.clientTypeId = clientTypeId;
        this.clientINN = clientINN;
        this.clientPhone = clientPhone;
        this.clientEmail = clientEmail;
        this.regionId = regionId;
        this.branchId = branchId;
        this.requestTypeId = requestTypeId;
        this.requestVersion = requestVersion;
        this.requestChangeDate = requestChangeDate;
        this.attributeList = attributeList;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getRequestIdPortal() {
        return requestIdPortal;
    }

    public void setRequestIdPortal(String requestIdPortal) {
        this.requestIdPortal = requestIdPortal;
    }

    public String getRequestIdEPGU() {
        return requestIdEPGU;
    }

    public void setRequestIdEPGU(String requestIdEPGU) {
        this.requestIdEPGU = requestIdEPGU;
    }

    public String getBranchIdPortal() {
        return branchIdPortal;
    }

    public void setBranchIdPortal(String branchIdPortal) {
        this.branchIdPortal = branchIdPortal;
    }

    public LocalDateTime getRequestCreatedDateTime() {
        return requestCreatedDateTime;
    }

    public void setRequestCreatedDateTime(LocalDateTime requestCreatedDateTime) {
        this.requestCreatedDateTime = requestCreatedDateTime;
    }

    public String getClientIdPortal() {
        return clientIdPortal;
    }

    public void setClientIdPortal(String clientIdPortal) {
        this.clientIdPortal = clientIdPortal;
    }

    public String getClientTypeId() {
        return clientTypeId;
    }

    public void setClientTypeId(String clientTypeId) {
        this.clientTypeId = clientTypeId;
    }

    public String getClientINN() {
        return clientINN;
    }

    public void setClientINN(String clientINN) {
        this.clientINN = clientINN;
    }

    public String getClientPhone() {
        return clientPhone;
    }

    public void setClientPhone(String clientPhone) {
        this.clientPhone = clientPhone;
    }

    public String getClientEmail() {
        return clientEmail;
    }

    public void setClientEmail(String clientEmail) {
        this.clientEmail = clientEmail;
    }

    public String getRegionId() {
        return regionId;
    }

    public void setRegionId(String regionId) {
        this.regionId = regionId;
    }

    public String getBranchId() {
        return branchId;
    }

    public void setBranchId(String branchId) {
        this.branchId = branchId;
    }

    public String getRequestTypeId() {
        return requestTypeId;
    }

    public void setRequestTypeId(String requestTypeId) {
        this.requestTypeId = requestTypeId;
    }

    public String getRequestVersion() {
        return requestVersion;
    }

    public void setRequestVersion(String requestVersion) {
        this.requestVersion = requestVersion;
    }

    public LocalDateTime getRequestChangeDate() {
        return requestChangeDate;
    }

    public void setRequestChangeDate(LocalDateTime requestChangeDate) {
        this.requestChangeDate = requestChangeDate;
    }

    public List<Attribute> getAttributesList() {
        return attributeList;
    }

    public void setAttributesList(List<Attribute> attributeList) {
        this.attributeList = attributeList;
    }

    public List<Attribute> getAttributeList() {
        return attributeList;
    }

    public void setAttributeList(List<Attribute> attributeList) {
        this.attributeList = attributeList;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Request request = (Request) o;
        return Objects.equals(id, request.id) && Objects.equals(requestIdPortal, request.requestIdPortal) && Objects.equals(requestIdEPGU, request.requestIdEPGU) && Objects.equals(branchIdPortal, request.branchIdPortal) && Objects.equals(requestCreatedDateTime, request.requestCreatedDateTime) && Objects.equals(clientIdPortal, request.clientIdPortal) && Objects.equals(clientTypeId, request.clientTypeId) && Objects.equals(clientINN, request.clientINN) && Objects.equals(clientPhone, request.clientPhone) && Objects.equals(clientEmail, request.clientEmail) && Objects.equals(regionId, request.regionId) && Objects.equals(branchId, request.branchId) && Objects.equals(requestTypeId, request.requestTypeId) && Objects.equals(requestVersion, request.requestVersion) && Objects.equals(requestChangeDate, request.requestChangeDate) && Objects.equals(attributeList, request.attributeList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, requestIdPortal, requestIdEPGU, branchIdPortal, requestCreatedDateTime, clientIdPortal, clientTypeId, clientINN, clientPhone, clientEmail, regionId, branchId, requestTypeId, requestVersion, requestChangeDate, attributeList);
    }

    @Override
    public String toString() {
        return "Request{" +
                "id=" + id +
                ", requestIdPortal='" + requestIdPortal + '\'' +
                ", requestIdEPGU='" + requestIdEPGU + '\'' +
                ", branchIdPortal='" + branchIdPortal + '\'' +
                ", requestCreatedDateTime=" + requestCreatedDateTime +
                ", clientIdPortal='" + clientIdPortal + '\'' +
                ", clientTypeId='" + clientTypeId + '\'' +
                ", clientINN='" + clientINN + '\'' +
                ", clientPhone='" + clientPhone + '\'' +
                ", clientEmail='" + clientEmail + '\'' +
                ", regionId='" + regionId + '\'' +
                ", branchId='" + branchId + '\'' +
                ", requestTypeId='" + requestTypeId + '\'' +
                ", requestVersion='" + requestVersion + '\'' +
                ", requestChangeDate=" + requestChangeDate +
                ", attributeList=" + attributeList +
                '}';
    }
}
