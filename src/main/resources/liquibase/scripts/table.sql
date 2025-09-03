-- liquibase formatted sql

-- changeset oss:1
CREATE TABLE requests(
    id BIGSERIAL PRIMARY KEY,
    request_id_portal varchar(50),
    request_id_EPGU varchar(50),
    branch_id_portal varchar(50),
    request_created_date_time TIMESTAMP,
    client_id_portal varchar(50),
    client_type_id varchar(50),
    client_INN varchar(50),
    client_phone varchar(12) UNIQUE,
    client_email varchar(50) UNIQUE,
    region_id varchar(4),
    branch_id varchar(50),
    request_type_id varchar(50),
    request_version varchar(50),
    request_change_date TIMESTAMP
);

-- changeset oss:2
CREATE TABLE attributes(
    id BIGSERIAL PRIMARY KEY,
    section_number varchar(50),
    section_id varchar(50),
    request_id BIGINT REFERENCES requests(id)
);

-- changeset oss:3
CREATE TABLE attribute_queries(
    id BIGSERIAL PRIMARY KEY,
    name varchar(50),
    margin varchar(20),
    attribute_id BIGINT REFERENCES attributes(id)
);

-- changeset oss:4
CREATE TABLE inform_files(
    id BIGSERIAL PRIMARY KEY,
    content varchar(255),
    content_type varchar(50),
    file_name varchar(50),
    name varchar(50),
    attributes_id BIGINT REFERENCES attributes(id)
);