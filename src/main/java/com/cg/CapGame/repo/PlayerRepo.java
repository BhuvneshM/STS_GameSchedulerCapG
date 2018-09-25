package com.cg.CapGame.repo;

import com.cg.CapGame.bean.Player;

public interface PlayerRepo {

	
	public Player save(Player p);
	public Player findByDayName(String dayName);
	public Player findByGamesName(String gameName);

}
