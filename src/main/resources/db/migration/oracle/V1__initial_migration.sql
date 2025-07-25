create table users
(
    id       NUMBER       not null
             constraint pk_users
             primary key,
    name     VARCHAR2(255) not null,
    email    VARCHAR2(255) not null,
    password VARCHAR2(255) not null
)
/

create table addresses
(
    id      NUMBER        not null
            constraint pk_addresses
            primary key,
    street  VARCHAR2(255) not null,
    city    VARCHAR2(255) not null,
    zip     VARCHAR2(255) not null,
    user_id NUMBER        not null
            constraint fk_addresses_users
            references users (id)
)
/