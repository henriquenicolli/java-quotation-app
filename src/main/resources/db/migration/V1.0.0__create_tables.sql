CREATE TABLE tbl_quotation (
    id INT NOT NULL AUTO_INCREMENT,
    expiration_date DATETIME,
    delivery_date DATE,
    delivery_price DECIMAL(4,2),
    description VARCHAR(255),
    observation VARCHAR(255),
    PRIMARY KEY (id)
);

CREATE TABLE tbl_product (
    id INT NOT NULL AUTO_INCREMENT,
    quantity INTEGER,
    cod_product VARCHAR(255),
    price DECIMAL(4,2),
    description VARCHAR(255),
    PRIMARY KEY (id)
);


