package com.espn.livescore.service;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;

import com.espn.livescore.entity.LiveScore;
import com.espn.livescore.repository.LiveScoreRepository;

@SpringBootTest
public class LiveScoreServiceTest {
	
	@InjectMocks
	private LiveScoreService liveScoreService;
	
	@Mock
	private LiveScoreRepository liveScoreRepository;
	
	@Test
	void getAllLiveScoresTest() {
		LiveScore liveScore1 = new LiveScore();
		liveScore1.setId(1L);
		liveScore1.setMatch("India vs Australia");
		liveScore1.setScore("250/3");
		liveScore1.setStatus("In Progress");
        LiveScore liveScore2 = new LiveScore();
        liveScore2.setId(1L);
        liveScore2.setMatch("India vs Pakistan");
        liveScore2.setScore("20/1");
        liveScore2.setStatus("In Progress");
		List<LiveScore> liveScores = Arrays.asList(liveScore1, liveScore2);
		when(liveScoreRepository.findAll()).thenReturn(liveScores);
		List<LiveScore> response = liveScoreService.getAllLiveScores();
		assertEquals(liveScores, response);
	}

}
