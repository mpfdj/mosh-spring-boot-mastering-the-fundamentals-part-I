create table users
(
    id       NUMBER       not null
             constraint users_pk
             primary key,
    name     VARCHAR2(255) not null,
    email    VARCHAR2(255) not null,
    password VARCHAR2(255) not null
)
/

create table addresses
(
    id      NUMBER        not null
            constraint addresses_pk
            primary key,
    street  VARCHAR2(255) not null,
    city    VARCHAR2(255) not null,
    zip     VARCHAR2(255) not null,
    user_id NUMBER        not null
            constraint addresses_USERS_ID_fk
            references users (id)
)
/