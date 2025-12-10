package com.example.cimaBooking.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "seats")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Seats {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "seats_id",nullable = false)
    private Integer seatsId;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "hall_id",nullable = false)
    private Hall hall;

    @Column(name = "seats_row",nullable = false)
    @Pattern(regexp = "^[A-Z]$", message = "row must be a single uppercase letter")
    @NotBlank(message = "row is required")
    private String row;

    @Column(name = "seats_column",nullable = false)
    @NotNull(message = "column is required")
    @Min(value = 1, message = "column must be positive")
    private Integer columnNumber;

    @Column(name = "seat_number", nullable = false ,unique = true)
    private String seatNumber;

    @PrePersist
    @PreUpdate
    public void generateSeatNumber(){
        if (row != null && columnNumber !=null){
            this.seatNumber = row + columnNumber;
        }
    }
}
