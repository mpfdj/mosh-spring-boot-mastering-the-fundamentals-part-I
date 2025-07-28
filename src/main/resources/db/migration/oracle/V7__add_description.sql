ALTER TABLE products
    ADD description VARCHAR2(255);

ALTER TABLE products
    MODIFY description NOT NULL;