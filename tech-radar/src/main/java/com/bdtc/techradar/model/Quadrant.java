package com.bdtc.techradar.model;

import com.bdtc.techradar.constant.QuadrantEnum;
import com.bdtc.techradar.dto.QuadrantDto;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Entity
@Table(name = "quadrant")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@EqualsAndHashCode(of = "id")
public class Quadrant {

    @Id
    @GeneratedValue
    private UUID id;

    @Column(unique = true)
    @Enumerated(EnumType.STRING)
    private QuadrantEnum name;  // e.g. languages-and-frameworks

    @Column(unique = true)
    private String title;  // e.g. Languages & Frameworks

    // QuadrantMap
    private String color;

    private String txtColor;

    @Column(unique = true)
    private Integer position;

    @Column(columnDefinition = "TEXT")
    private String description;

    public Quadrant(QuadrantDto quadrantDto) {
        this.name = quadrantDto.name();
        this.title = quadrantDto.title();
        this.color = quadrantDto.color();
        this.txtColor = quadrantDto.txtColor();
        this.position = quadrantDto.position();
        this.description = quadrantDto.description();
    }
}
