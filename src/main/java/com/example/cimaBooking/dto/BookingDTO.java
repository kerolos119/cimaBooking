package com.example.cimaBooking.dto;

import com.example.cimaBooking.entity.Movie;
import com.example.cimaBooking.entity.ShowTime;
import com.example.cimaBooking.entity.Users;
import jakarta.validation.constraints.NotNull;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class BookingDTO {

    @NotNull(message = "user is required")
    private Users users;

    @NotNull(message = "show time is required")
    private ShowTime showTime;

    @NotNull(message = "movie is requird")
    private Movie movie;
}
