package com.devsuperior.dsmovie.service;

import com.devsuperior.dsmovie.dto.MovieDTO;
import com.devsuperior.dsmovie.entity.Movie;
import com.devsuperior.dsmovie.repository.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class MovieService {

    @Autowired
    private MovieRepository movieRepository;

    @Transactional
    public Page<MovieDTO> findAll(Pageable pageable){
        Page<Movie> pageMovie = movieRepository.findAll(pageable);
        Page<MovieDTO> pageMovieDto = pageMovie.map(x -> new MovieDTO(x));
        return pageMovieDto;
    }

    public MovieDTO findById(Long id){
        Movie movie = movieRepository.findById(id).get();
        MovieDTO movieDto = new MovieDTO(movie);
        return movieDto;
    }
}
