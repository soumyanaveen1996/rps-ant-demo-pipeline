package com.mcnz.rps;

public class GameService {
	

	public GameSummary playRoshambo(String clientGesture) {
		
		String result = "error";
		if ("scissors".equals(clientGesture)) {
			result = "lose";
		}
		if ("paper".equals(clientGesture)) {
			result = "win";
		}
		if ("rock".equals(clientGesture)) {
			result = "tie";
		}
		GameSummary gameSummary = new GameSummary(clientGesture, "rock", result);
		return gameSummary;
	}

}  
  
