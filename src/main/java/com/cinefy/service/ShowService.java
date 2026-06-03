package com.cinefy.service;

import com.cinefy.dto.ShowDto;
import com.cinefy.entity.Movie;
import com.cinefy.entity.Screen;
import com.cinefy.entity.Show;
import com.cinefy.repository.MovieRepository;
import com.cinefy.repository.ScreenRepository;
import com.cinefy.repository.ShowRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ShowService {

    private final ShowRepository showRepository;
    private final MovieRepository movieRepository;
    private final ScreenRepository screenRepository;

    public Show createShow(ShowDto dto) {

        Movie movie = movieRepository.findById(dto.getMovieId())
                .orElseThrow();

        Screen screen = screenRepository.findById(dto.getScreenId())
                .orElseThrow();

        Show show = new Show();

        show.setStartTime(dto.getStartTime());
        show.setEndTime(dto.getEndTime());
        show.setMovie(movie);
        show.setScreen(screen);

        return showRepository.save(show);
    }
}