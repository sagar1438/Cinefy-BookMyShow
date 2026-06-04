package com.cinefy.controller;

import com.cinefy.dto.MovieDto;
import com.cinefy.entity.Movie;
import com.cinefy.service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/movies")
public class MoviesController {

    @Autowired
    private MovieService movieService;

    @PostMapping
    public ResponseEntity<Movie> createMovie(
            @RequestBody MovieDto movieDto) {

        Movie movie = movieService.createMovie(movieDto);

        return new ResponseEntity<>(
                movie,
                HttpStatus.CREATED);
    }
}