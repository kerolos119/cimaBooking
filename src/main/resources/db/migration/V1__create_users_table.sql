CREATE TYPE gender_enum AS ENUM (
    'MALE',
    'FEMALE'
);

CREATE TYPE role_enum AS ENUM (
    'ADMIN',
    'USERS'
);

CREATE TABLE users(
                      user_id BIGSERIAL PRIMARY KEY ,
                      username VARCHAR(50) NOT NULL ,
                      email VARCHAR(100) unique NOT NULL ,
                      password VARCHAR(255) NOT NULL ,
                      phone_number VARCHAR(150) NOT NULL ,
                      gender gender_enum NOT NULL ,
                      role VARCHAR(20) NOT NULL
);