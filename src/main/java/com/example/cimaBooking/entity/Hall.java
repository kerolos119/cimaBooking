package com.example.cimaBooking.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.*;

import java.util.List;

@Entity
@Table(name = "hall")
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
public class Hall {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "hall_id")
    private Long hallId;

    @Column(name = "hall_name" , nullable = false ,unique = true)
    @NotBlank(message = "Hall name is required")
    private String hallName;

    @Column(name = "seat_count",nullable = false)
    @NotNull(message = "seat count is required")
    private Integer seatCount;

    @OneToMany(mappedBy = "hall", cascade = CascadeType.ALL, orphanRemoval = true, fetch = FetchType.LAZY)
    @JsonIgnore
    private List<Seats> seats;

}
