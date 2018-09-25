package com.cg.CapGame.repo;

import com.cg.CapGame.bean.Game;

public interface GameRepo {
	
	public boolean save(Game game);
	public Game findByName(String name);

}
