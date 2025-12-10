package com.example.cimaBooking.entity;

import com.example.cimaBooking.model.Gender;
import com.example.cimaBooking.model.Role;
import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import lombok.*;

@Entity
@Table(name = "users")
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
public class Users {

    @Id
    @Column(name = "user_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer userId;

    @Column(name = "username" , length = 50,nullable = false)
    @NotBlank(message = "username is required")
    private String username;

    @Column(name = "email" , unique = true,length = 100,nullable = false)
    @Size(max = 100)
    @NotBlank(message = "email is required")
    @Email(message = "invalid email format")
    private String email;

    @Column(name = "password" , length = 255 , nullable = false)
    @NotBlank(message = "password is required")
    @Size(min = 8 , message = "password must contain at least 8 character")
    @Pattern(
            regexp = "^(?=.*[A-Z])(?=.*[a-z])(?=.*\\d)(?=.*[@$!%*?&])[A-Za-z\\d@$!%*?&]{8,}$",
            message = "password must contain uppercase, lowercase, number, and special character"
    )
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    @ToString.Exclude
    private String password;

    @Column(name = "phoneNumber", length = 15 ,nullable = false)
    @NotBlank(message = "phone number is required")
    @Pattern(regexp = "^\\+?[1-9]\\d{7,14}$",
            message = "Invalid phone number")
    private String phoneNumber;

    @Enumerated(EnumType.STRING)
    @Column(name = "gender" , nullable = false)
    @NotNull(message = "gender is required")
    private Gender gender;

    @Enumerated(EnumType.STRING)
    @Column(name = "role" , nullable = false)
    @NotNull(message = "role is required")
    private Role role;
}
