package com.example.cimaBooking.entity;

import com.example.cimaBooking.model.Category;
import jakarta.persistence.*;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.*;

import java.time.LocalDate;

@Entity
@Table(name = "movie")
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
public class Movie {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "movie_id")
    private Long movieId;

    @Column(name = "title", nullable = false, unique = true)
    @NotBlank(message = "title is required")
    private String title;

    @Column(name = "description", nullable = false, length = 500)
    @NotBlank(message = "description is required")
    private String description;

    @Column(name = "duration_minutes", nullable = false)
    @NotNull(message = "duration minutes is required")
    private Integer durationMinutes;

    @Column(name = "catagory", nullable = false)
    @NotNull(message = "catagory is required")
    @Enumerated(EnumType.STRING)
    private Category category;

    @Column(name = "rating")
    @Min(0)
    @Max(10)
    private int rating;

    @Column(name = "release_date")
    private LocalDate releaseDate;

}
