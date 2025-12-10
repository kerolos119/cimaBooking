package com.example.cimaBooking.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.*;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
@Table(name = "showtime")
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
public class ShowTime {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "showtime_id")
    private int showTimeId;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "movie_id",nullable = false)
    private Movie movie;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "hall_id",nullable = false)
    private Hall hall;

    @Column(name = "start_time",nullable = false)
    @NotNull(message = "start time is required")
    private LocalDateTime startTime;

    @Column(name = "end_time",nullable = false)
    @NotNull(message = "end time is required")
    private LocalDateTime endTime;

    @Column(name = "date", nullable = false)
    @NotNull(message = "date is required")
    private LocalDate date;

    @Column(name = "price",nullable = false)
    @NotNull(message = "price is required")
    private Float price;
}
