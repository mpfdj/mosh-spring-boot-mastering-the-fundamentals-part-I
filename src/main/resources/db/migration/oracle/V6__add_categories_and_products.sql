create table categories
(
    id   NUMBER not null
         constraint pk_category
         primary key,
    name VARCHAR2(255) not null
)
/

create table products
(
    id          NUMBER not null
                constraint pk_product
                primary key,
    name        VARCHAR2(255) not null,
    price       NUMBER(10, 2) not null,
    category_id NUMBER not null
                constraint fk_category
                references CATEGORIES (id)
)
/
