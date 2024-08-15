package com.espn.livescore.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.espn.livescore.entity.LiveScore;
import com.espn.livescore.service.LiveScoreService;

@RestController
@RequestMapping("/live-scores")
public class LiveScoreController {

    @Autowired
    private LiveScoreService liveScoreService;

    @GetMapping
    public List<LiveScore> getAllLiveScores() {
        return liveScoreService.getAllLiveScores();
    }

    @PostMapping
    public LiveScore addLiveScore(@RequestBody LiveScore liveScore) {
        return liveScoreService.addLiveScore(liveScore);
    }

    @PutMapping("/{id}")
    public LiveScore updateLiveScore(@PathVariable Long id, @RequestBody LiveScore liveScore) {
        return liveScoreService.updateLiveScore(id, liveScore);
    }

    @DeleteMapping("/{id}")
    public void deleteLiveScore(@PathVariable Long id) {
        liveScoreService.deleteLiveScore(id);
    }
}
