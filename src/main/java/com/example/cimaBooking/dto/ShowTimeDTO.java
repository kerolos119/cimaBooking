package com.example.cimaBooking.dto;

import com.example.cimaBooking.entity.Hall;
import com.example.cimaBooking.entity.Movie;
import jakarta.validation.constraints.NotNull;
import lombok.*;

import java.time.LocalDateTime;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
public class ShowTimeDTO {
    @NotNull(message = "movie is required")
    private Movie movie;

    @NotNull(message = "hall is required")
    private Hall hall;

    @NotNull(message = "start time is required")
    private LocalDateTime startTime;

    @NotNull(message = "and time is required")
    private LocalDateTime endTime;

    @NotNull(message = "price is required")
    private Float price;
}
