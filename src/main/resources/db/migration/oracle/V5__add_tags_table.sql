create table tags
(
    id   NUMBER
         constraint pk_tags
         primary key,
    name varchar(255) not null
)
/


create table user_tags
(
    user_id NUMBER not null
                   constraint fk_user_tags_users
                   references users (id)
                   on delete cascade,
    tag_id  NUMBER not null
                   constraint fk_user_tags_tags
                   references tags (id)
                   on delete cascade,
    constraint pk_user_tags
    primary key (user_id, tag_id)
)
/
