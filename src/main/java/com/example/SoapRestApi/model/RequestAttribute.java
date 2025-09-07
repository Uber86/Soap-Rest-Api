package com.example.SoapRestApi.model;

import jakarta.persistence.*;

import java.util.Objects;

/**
 * Класс RequestAttribute, информационный класс об оборудовании
 */
@Entity
@Table(name = "attribute_queries")
public class RequestAttribute {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @Column(name = "margin")
    private String value;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "attribute_id")
    private Attribute attribute;

    public RequestAttribute() {
    }

    public RequestAttribute(Long id, String name, String value, Attribute attribute) {
        this.id = id;
        this.name = name;
        this.value = value;
        this.attribute = attribute;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public Attribute getAttribute() {
        return attribute;
    }

    public void setAttribute(Attribute attribute) {
        this.attribute = attribute;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        RequestAttribute that = (RequestAttribute) o;
        return Objects.equals(id, that.id) && Objects.equals(name, that.name) && Objects.equals(value, that.value) && Objects.equals(attribute, that.attribute);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, value, attribute);
    }

    @Override
    public String toString() {
        return "RequestAttribute{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", value='" + value + '\'' +
                ", attribute=" + attribute +
                '}';
    }
}
