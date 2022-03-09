package com.devsuperior.dsmovie.repository;

import com.devsuperior.dsmovie.entity.Movie;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MovieRepository extends JpaRepository<Movie, Long> {
}
