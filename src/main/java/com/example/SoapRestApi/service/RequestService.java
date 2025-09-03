package com.example.SoapRestApi.service;

import com.example.SoapRestApi.dto.RequestDTO;
import jakarta.validation.ValidationException;

import java.util.List;

public interface RequestService {

    RequestDTO createRequest(RequestDTO requestDTO);

    // Получение заявки по ID
    RequestDTO getRequestById(Long id);

    // Получение всех заявок или с фильтрами
    List<RequestDTO> getAllRequests();

    // Обновление заявки по ID с данными из DTO
    RequestDTO updateRequest(Long id, RequestDTO requestDTO);

    // Удаление заявки по ID
    void deleteRequest(Long id);

    // Приём XML-запроса, парсинг в DTO, создание заявки
    RequestDTO createRequestFromXml(String xml);

    // Формирование XML по DTO или сущности заявки
    String generateXmlFromRequest(RequestDTO requestDTO);

    // Валидация входных данных заявки
    void validateRequest(RequestDTO requestDTO) throws ValidationException;
}
