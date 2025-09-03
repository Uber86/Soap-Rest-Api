package com.example.SoapRestApi.model;

import jakarta.persistence.*;

import java.util.Objects;

/**
 * Класс FileInfo - информация по предоставленному файлу
 */
public class FileInfo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String content;

    private String contentType;

    private String fileName;

    private String name;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "attributes_id")
    private Attribute attribute;

    public FileInfo() {
    }

    public FileInfo(Long id, String content,
                    String contentType, String fileName,
                    String name, Attribute attribute) {
        this.id = id;
        this.content = content;
        this.contentType = contentType;
        this.fileName = fileName;
        this.name = name;
        this.attribute = attribute;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getContentType() {
        return contentType;
    }

    public void setContentType(String contentType) {
        this.contentType = contentType;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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
        FileInfo fileInfo = (FileInfo) o;
        return Objects.equals(id, fileInfo.id) && Objects.equals(content, fileInfo.content) && Objects.equals(contentType, fileInfo.contentType) && Objects.equals(fileName, fileInfo.fileName) && Objects.equals(name, fileInfo.name) && Objects.equals(attribute, fileInfo.attribute);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, content, contentType, fileName, name, attribute);
    }

    @Override
    public String toString() {
        return "FileInfo{" +
                "id=" + id +
                ", content='" + content + '\'' +
                ", contentType='" + contentType + '\'' +
                ", fileName='" + fileName + '\'' +
                ", name='" + name + '\'' +
                ", attribute=" + attribute +
                '}';
    }
}
