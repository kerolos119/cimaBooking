CREATE TABLE showtime (
                          showtime_id BIGSERIAL PRIMARY KEY ,
                          movie_id BIGINT NOT NULL ,
                          hall_id BIGINT NOT NULL ,
                          start_time TIMESTAMP NOT NULL ,
                          end_time TIMESTAMP NOT NULL ,
                          date DATE NOT NULL ,
                          price REAL NOT NULL ,

                          CONSTRAINT fk_showtime_movie
                              FOREIGN KEY (movie_id)
                                  REFERENCES movie(movie_id)
                                  ON DELETE CASCADE ,
                          CONSTRAINT fk_showtime_hall
                              FOREIGN KEY (hall_id)
                                  REFERENCES hall(hall_id)
                                  ON DELETE CASCADE
);