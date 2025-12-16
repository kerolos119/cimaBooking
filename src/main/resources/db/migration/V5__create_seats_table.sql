CREATE TABLE seats (
                       seats_id BIGSERIAL PRIMARY KEY ,
                       hall_id BIGINT NOT NULL ,
                       seats_row CHAR(1) NOT NULL ,
                       seats_column INT NOT NULL CHECK ( seats_column > 0 ),
                       seats_number VARCHAR(10) NOT NULL ,
                       CONSTRAINT fk_seats_hall
                           FOREIGN KEY (hall_id)
                               REFERENCES hall(hall_id)
                               ON DELETE CASCADE
);