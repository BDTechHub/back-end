package com.bdtc.techradar.service;

import com.bdtc.techradar.dto.QuadrantDetailDto;
import com.bdtc.techradar.dto.QuadrantDto;
import com.bdtc.techradar.model.Quadrant;
import com.bdtc.techradar.repository.QuadrantRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class QuadrantService {

    @Autowired
    private QuadrantRepository quadrantRepository;

    public List<QuadrantDto> getViewQuadrants() {
        List<QuadrantDto> quadrantViewDtos = new ArrayList<>();
        List<Quadrant> quadrantsList = quadrantRepository.findAll();
        for (Quadrant quadrant : quadrantsList) {
            quadrantViewDtos.add(new QuadrantDto(quadrant));
        }
        return quadrantViewDtos;
    }

    public QuadrantDetailDto createQuadrant(QuadrantDto quadrantDto) {
        Quadrant quadrant = new Quadrant(quadrantDto);
        quadrantRepository.save(quadrant);
        return new QuadrantDetailDto(quadrant);
    }
}
