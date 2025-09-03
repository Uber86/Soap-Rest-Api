package com.example.SoapRestApi.repository;

import com.example.SoapRestApi.model.RequestAttribute;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RequestAttributeRepository extends JpaRepository<RequestAttribute, Long> {
}
