package com.example.SoapRestApi.model;

import jakarta.persistence.*;

import java.util.List;
import java.util.Objects;

@Entity
public class Attribute {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToMany(mappedBy = "attribute", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<RequestAttribute> requestAttribute;

    @OneToMany(mappedBy = "attribute", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<FileInfo> fileInfo;

    private int sectionNumber;

    private int sectionId;

    @OneToOne
    @JoinColumn(name = "request_id")
    private Request request;

    public Attribute() {
    }

    public Attribute(Long id, List<RequestAttribute> requestAttribute, List<FileInfo> fileInfo, int sectionNumber, int sectionId) {
        this.id = id;
        this.requestAttribute = requestAttribute;
        this.fileInfo = fileInfo;
        this.sectionNumber = sectionNumber;
        this.sectionId = sectionId;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public List<RequestAttribute> getRequestAttribute() {
        return requestAttribute;
    }

    public void setRequestAttribute(List<RequestAttribute> requestAttribute) {
        this.requestAttribute = requestAttribute;
    }

    public List<FileInfo> getFileInfo() {
        return fileInfo;
    }

    public void setFileInfo(List<FileInfo> fileInfo) {
        this.fileInfo = fileInfo;
    }

    public int getSectionNumber() {
        return sectionNumber;
    }

    public void setSectionNumber(int sectionNumber) {
        this.sectionNumber = sectionNumber;
    }

    public int getSectionId() {
        return sectionId;
    }

    public void setSectionId(int sectionId) {
        this.sectionId = sectionId;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Attribute that = (Attribute) o;
        return sectionNumber == that.sectionNumber && sectionId == that.sectionId && Objects.equals(id, that.id) && Objects.equals(requestAttribute, that.requestAttribute) && Objects.equals(fileInfo, that.fileInfo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, requestAttribute, fileInfo, sectionNumber, sectionId);
    }

    @Override
    public String toString() {
        return "Attribute{" +
                "id=" + id +
                ", requestAttribute=" + requestAttribute +
                ", fileInfo=" + fileInfo +
                ", sectionNumber=" + sectionNumber +
                ", sectionId=" + sectionId +
                '}';
    }
}
