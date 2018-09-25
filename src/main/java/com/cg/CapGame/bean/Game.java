package com.cg.CapGame.bean;

public class Game {

	private String gameName;
	private int noOfPlayers;

	public Game() {
		super();

	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((gameName == null) ? 0 : gameName.hashCode());
		result = prime * result + noOfPlayers;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Game other = (Game) obj;
		if (gameName == null) {
			if (other.gameName != null)
				return false;
		} else if (!gameName.equals(other.gameName))
			return false;
		if (noOfPlayers != other.noOfPlayers)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Game [gameName=" + gameName + ", noOfPlayers=" + noOfPlayers + "]";
	}

	public Game(String gameName, int i) {
		super();
		this.gameName = gameName;
		this.noOfPlayers = i;
	}

	public String getGameName() {
		return gameName;
	}

	public void setGameName(String gameName) {
		this.gameName = gameName;
	}

	public int getNoOfPlayers() {
		return noOfPlayers;
	}

	public void setNoOfPlayers(byte noOfPlayers) {
		this.noOfPlayers = noOfPlayers;
	}

}
