package com.arcade.slowrat.entity;

import jakarta.persistence.*;
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
    private String username;
    @Column(length = 60)
    private String password;
    private String email;
    private String name;
    private String role;
    private String passwordHash;
    private Date createdAt;
    private boolean enabled = false;

}
