package com.cg.CapGame.service;

import com.cg.CapGame.bean.DayReport;
import com.cg.CapGame.bean.GameReport;
import com.cg.CapGame.bean.PlayerReport;

public interface ReportService {

	public GameReport gameWiseReport(String gameName);
	public PlayerReport playerWiseReport(String playerName);
	public DayReport dayWiseReport(String dayName);
	
}
