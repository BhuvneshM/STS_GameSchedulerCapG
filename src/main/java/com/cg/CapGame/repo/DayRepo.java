package com.cg.CapGame.repo;

import com.cg.CapGame.bean.Day;

public interface DayRepo {

	public Day save(Day d);
	public Day findByPlayerName(String playerName);
	public Day findByGamesName(String gameName);
}
