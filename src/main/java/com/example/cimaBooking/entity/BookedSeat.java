package com.example.cimaBooking.entity;

import jakarta.persistence.*;
import jakarta.persistence.criteria.CriteriaBuilder;
import jakarta.validation.constraints.NotNull;
import lombok.*;

@Entity
@Table(name = "booked_seat")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class BookedSeat {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "booked_seat_id",nullable = false)
    private Long bookedSeatId;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "booking_id",nullable = false)
    @NotNull(message = "booking is required")
    private Booking booking;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "seats_id",nullable = false)
    @NotNull(message = "seats is required")
    private Seats seats;
}
