CREATE TYPE category_enum AS ENUM(
    'ACTION',
    'ADVENTURE',
    'COMEDY',
    'DRAMA',
    'HORROR',
    'THRILLER',
    'SCIENCE_FICTION',
    'FANTASY',
    'ROMANCE',
    'ROMANCE_COMEDY',
    'MYSTERY',
    'CRIME',
    'ANIMATION',
    'DOCUMENTARY',
    'BIOGRAPHY',
    'HISTORICAL',
    'WAR',
    'MUSICAL',
    'FAMILY',
    'SPORTS'
    );

CREATE TABLE movie(
                      movie_id BIGSERIAL PRIMARY KEY ,
                      title VARCHAR(500) NOT NULL ,
                      description VARCHAR(500) NOT NULL ,
                      duration_minutes INT NOT NULL ,
                      category category_enum NOT NULL ,
                      rating INT CHECK ( rating BETWEEN 0 AND 10),
                      release_date DATE
);