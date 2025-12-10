package com.example.cimaBooking.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class HallDTO {

    @NotBlank(message = "hall name is required")
    private String hallName;

    @NotNull(message = "seat count is required")
    private Integer seatCount;
}
