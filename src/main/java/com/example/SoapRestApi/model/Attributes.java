package com.example.SoapRestApi.model;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Attributes {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToMany
    private List<RequestAttribute> requestAttribute;

    @OneToMany
    private List<FileInfo> fileInfo;

}
