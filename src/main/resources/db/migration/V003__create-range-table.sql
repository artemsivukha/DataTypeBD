CREATE TABLE range
(
    id      BIGSERIAL,
    bt      VARCHAR,
    mn      VARCHAR,
    mx      VARCHAR,
    dt      VARCHAR NOT NULL,
    CONSTRAINT range_id_pk PRIMARY KEY (id)
);

ALTER TABLE data_type
ADD COLUMN range_id BIGINT;