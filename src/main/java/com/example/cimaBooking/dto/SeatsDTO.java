package com.example.cimaBooking.dto;

import com.example.cimaBooking.entity.Hall;
import jakarta.persistence.criteria.CriteriaBuilder;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
public class SeatsDTO {

    @NotNull(message = "hallId is required")
    private Hall hall;

    @NotBlank(message = "row is required")
    private String row;

    @NotNull(message = "column is required")
    private Integer columnNumber;

    @NotBlank(message = "seat number is required")
    public String seatNumber;
}
