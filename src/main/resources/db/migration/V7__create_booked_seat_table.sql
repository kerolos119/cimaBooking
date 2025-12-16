CREATE TABLE booked_seat(
                            booked_seat_id BIGSERIAL PRIMARY KEY ,
                            booking_id BIGINT NOT NULL ,
                            seats_id BIGINT NOT NULL ,

                            CONSTRAINT fk_booked_seat_booking
                                FOREIGN KEY (booking_id)
                                    REFERENCES booking(booking_id)
                                    ON DELETE CASCADE,
                            CONSTRAINT fk_booked_seat_seats
                                FOREIGN KEY (seats_id)
                                    REFERENCES seats(seats_id)
                                    ON DELETE CASCADE
);