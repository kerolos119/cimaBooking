CREATE TABLE booking (
                         booking_id BIGSERIAL PRIMARY KEY ,
                         user_id BIGINT NOT NULL ,
                         showtime_id BIGINT NOT NULL ,
                         movie_id BIGINT NOT NULL ,

                         CONSTRAINT fk_booking_users
                             FOREIGN KEY (user_id)
                                 REFERENCES users(user_id)
                                 ON DELETE CASCADE ,

                         CONSTRAINT fk_booking_showtime
                             FOREIGN KEY (showtime_id)
                                 REFERENCES showtime(showtime_id)
                                 ON DELETE CASCADE ,

                         CONSTRAINT fk_booking_movie
                             FOREIGN KEY (movie_id)
                                 REFERENCES movie(movie_id)
                                 ON DELETE CASCADE
);