create table profiles
(
    id             NUMBER
                   constraint fk_profiles_users
                   references users (id),
    bio            clob,
    phone_number   varchar(15),
    date_of_birth  date,
    loyalty_points NUMBER default 0
)
/
