package com.example.cimaBooking.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "booking")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class Booking {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "booking_id",nullable = false)
    private Long bookingId;

    @OneToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "user_id",nullable = false)
    private Users users;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "showtime_id",nullable = false)
    private ShowTime showTime;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "movie_id", nullable = false)
    private Movie movie;

}
