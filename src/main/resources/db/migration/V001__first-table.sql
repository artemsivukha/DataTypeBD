CREATE TABLE data_type
(
    id      BIGSERIAL,
    name    VARCHAR NOT NULL,
    type    VARCHAR NOT NULL,
    CONSTRAINT data_type_id_pk PRIMARY KEY (id)
);