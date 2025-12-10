package com.example.cimaBooking.dto;

import com.example.cimaBooking.entity.Booking;
import com.example.cimaBooking.entity.Seats;
import jakarta.validation.constraints.NotNull;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
public class BookedSeatDTO {

    @NotNull(message = "booking is required")
    private Booking booking;

    @NotNull(message = "seats is required")
    private Seats seats;
}
