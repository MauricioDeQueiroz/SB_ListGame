package com.MGames.repositories;


import org.springframework.data.jpa.repository.JpaRepository;

import com.MGames.entities.Game;

public interface GameRepository extends JpaRepository<Game, Long> {

}