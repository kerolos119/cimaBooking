package com.example.cimaBooking.dto;

import com.example.cimaBooking.model.Category;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.*;

import java.time.LocalDate;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter

public class MovieDTO {

    @NotBlank(message = "title is required")
    private String title;

    @NotBlank(message = "description is required")
    private String description;

    @NotNull(message = "duration minutes is required")
    private Integer durationMinutes;

    @NotNull(message = "catagory is required")
    private Category category;

    @Min(0)
    @Max(10)
    private int rating;

    private LocalDate releaseDate;
}
