package com.espn.livescore.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.espn.livescore.entity.LiveScore;
import com.espn.livescore.repository.LiveScoreRepository;

@Service
public class LiveScoreService {

    @Autowired
    private LiveScoreRepository liveScoreRepository;

    public List<LiveScore> getAllLiveScores() {
        return liveScoreRepository.findAll();
    }

    public LiveScore addLiveScore(LiveScore liveScore) {
        return liveScoreRepository.save(liveScore);
    }

    public LiveScore updateLiveScore(Long id, LiveScore liveScore) {
        liveScore.setId(id);
        return liveScoreRepository.save(liveScore);
    }

    public void deleteLiveScore(Long id) {
        liveScoreRepository.deleteById(id);
    }
}
