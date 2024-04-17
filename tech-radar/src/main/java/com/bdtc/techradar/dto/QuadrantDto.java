package com.bdtc.techradar.dto;

import com.bdtc.techradar.constant.QuadrantEnum;
import com.bdtc.techradar.model.Quadrant;

public record QuadrantDto(
        QuadrantEnum name,
        String title,
        String color,
        String txtColor,
        Integer position,
        String description
) {
    public QuadrantDto(Quadrant quadrant) {
        this(
            quadrant.getName(),
            quadrant.getTitle(),
            quadrant.getColor(),
            quadrant.getTxtColor(),
            quadrant.getPosition(),
            quadrant.getDescription()
        );
    }
}
