package com.arcade.slowrat.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.*;

import java.util.Date;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@RequiredArgsConstructor
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    @Column(unique = true)
    @Size(min = 8, max = 50)
    @NotBlank
    private String username;

    @Column(length = 60)
    private String password;

    @NotNull
    @Column(unique = true)
    @Size(min = 8, max = 210)
    @NotBlank
    @Email
    private String email;

    private String name;

    private String role;

    private String passwordHash;

    private Date createdAt;

    private boolean enabled = false;

}
