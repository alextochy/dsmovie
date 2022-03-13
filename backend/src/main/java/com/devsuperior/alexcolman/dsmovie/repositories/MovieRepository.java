package com.devsuperior.alexcolman.dsmovie.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devsuperior.alexcolman.dsmovie.entities.Movie;

public interface MovieRepository extends JpaRepository<Movie, Long> {

}
