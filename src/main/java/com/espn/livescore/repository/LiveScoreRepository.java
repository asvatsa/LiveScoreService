package com.espn.livescore.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.espn.livescore.entity.LiveScore;

@Repository
public interface LiveScoreRepository extends JpaRepository<LiveScore, Long> {
}
