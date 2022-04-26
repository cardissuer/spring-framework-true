create table EMPLOYEES(
                          id bigint not null,
                          primary key (id),
                          firstname varchar(50),
                          lastname varchar(50),
                          email varchar(50),
                          hire_date date,
                          gender varchar(1),
                          salary int not null
);