package com.devsuperior.alexcolman.dsmovie.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devsuperior.alexcolman.dsmovie.entities.Score;
import com.devsuperior.alexcolman.dsmovie.entities.ScorePK;

public interface ScoreRepository extends JpaRepository<Score, ScorePK> {

}
