package com.cinefy.service;

import com.cinefy.dto.MovieDto;
import com.cinefy.entity.Movie;
import com.cinefy.repository.MovieRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class MovieService {

    private final MovieRepository movieRepository;

    public Movie createMovie(MovieDto dto) {

        Movie movie = Movie.builder()
                .title(dto.getTitle())
                .description(dto.getDescription())
                .language(dto.getLanguage())
                .genre(dto.getGenre())
                .durationMins(dto.getDurationMins())
                .releaseDate(dto.getReleaseDate())
                .posterUrl(dto.getPosterUrl())
                .build();

        return movieRepository.save(movie);
    }
}