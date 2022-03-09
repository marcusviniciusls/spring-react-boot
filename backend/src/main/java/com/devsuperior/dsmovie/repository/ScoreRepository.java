package com.devsuperior.dsmovie.repository;

import com.devsuperior.dsmovie.entity.Score;
import com.devsuperior.dsmovie.entity.ScorePK;
import com.devsuperior.dsmovie.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ScoreRepository extends JpaRepository<Score, ScorePK> {
}
