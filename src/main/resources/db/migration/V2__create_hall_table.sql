CREATE TABLE hall (
                      hall_id BIGSERIAL PRIMARY KEY ,
                      hall_name VARCHAR UNIQUE NOT NULL ,
                      seat_count INT NOT NULL
);