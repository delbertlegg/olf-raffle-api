create table person (
    id              serial not null primary key,
    first_name      varchar(50) not null,
    last_name       varchar(50) not null,
    email_address   varchar(50),
    phone_number    varchar(50)
);

create table raffle (
    id              serial not null primary key,
    name            varchar(50) not null,
    description     varchar(200)
);

create table raffle_entry (
    person_id int references person,
    raffle_id int references raffle
);