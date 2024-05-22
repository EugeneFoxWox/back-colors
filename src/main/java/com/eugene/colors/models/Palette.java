package com.eugene.colors.models;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Data
@Builder
@RequiredArgsConstructor

@AllArgsConstructor
public class Palette {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false,name = "primaryColor")
    private String primary;

    @Column(nullable = false,name = "secondaryColor")
    private String secondary;

    @Column(nullable = false,name = "tertiaryColor")
    private String tertiary;

    @Column(nullable = false,name = "quaternaryColor")
    private String quaternary;


}
