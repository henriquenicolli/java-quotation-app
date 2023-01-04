CREATE TABLE tbl_quotation (
    id_quotation BIGINT UNSIGNED NOT NULL,
    expiration_date DATETIME,
    delivery_date DATE,
    delivery_price DECIMAL(4,2),
    description VARCHAR(255),
    observation VARCHAR(255),
    PRIMARY KEY (id_quotation)
);

CREATE TABLE tbl_product (
    id_product BIGINT UNSIGNED NOT NULL,
    quantity INTEGER,
    cod_product DATE,
    price DECIMAL(4,2),
    description VARCHAR(255),
    PRIMARY KEY (id_product)
);


