package com.cinefy.service;

import com.cinefy.dto.TheaterDto;
import com.cinefy.entity.Theater;
import com.cinefy.repository.TheaterRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class TheaterService {

    private final TheaterRepository theaterRepository;

    public Theater createTheater(TheaterDto dto) {

        Theater theater = Theater.builder()
                .name(dto.getName())
                .address(dto.getAddress())
                .city(dto.getCity())
                .totalScreens(dto.getTotalScreens())
                .build();

        return theaterRepository.save(theater);
    }
}