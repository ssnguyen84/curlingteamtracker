package ca.bcit.comp2613.a00578633.util;

import java.util.ArrayList;

import ca.bcit.comp2613.a00578633.model.Player;

public class TestDriver{

	public static void main(String[] args) throws Exception {
		try{
			System.out.println("Number of players generated: 50");
			ArrayList<Player> players = CreatePlayer.createPlayers(50); // change number of instances
			ArrayList<Player> playersByCurProv = Player.searchPlayersByCurrentProvince(players, "BC"); // change Province arg
			Player.printPlayers(playersByCurProv);
			System.out.println("--------------------------------");
			System.out.println("Player Searched by Last Name Regex: J*");
			System.out.println("--------------------------------");
			ArrayList<Player> playersByLastNameRegex = Player.searchPlayersByLastNameRegex(players, "J.*"); // change regex arg
			Player.printPlayers(playersByLastNameRegex);
					
			
		} catch (PlayerPerformanceException e) {
			System.err.println("Caught RuntimeException: Player cannot have 0 performance"  );
		} catch (TeamQQException e) {
			System.err.println("Caught IOException: Player cannot be currently on Team QQ" );
		}

	}

}
