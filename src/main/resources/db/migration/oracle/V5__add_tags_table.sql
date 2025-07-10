create table tags
(
    id   NUMBER
         constraint tags_pk
         primary key,
    name varchar(255) not null
)
/


create table user_tags
(
    user_id NUMBER not null
                   constraint user_tags_USERS_ID_fk
                   references users (id)
                   on delete cascade,
    tag_id  NUMBER not null
                   constraint user_tags_TAGS_ID_fk
                   references tags (id)
                   on delete cascade,
    constraint user_tags_pk
        primary key (user_id, tag_id)
)
/
