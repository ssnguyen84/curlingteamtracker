package ca.bcit.comp2613.a00578633.util;

import java.util.ArrayList;

import ca.bcit.comp2613.a00578633.model.Player;

public class TestDriver{

	public static void main(String[] args) throws Exception {
		System.out.println("Number of players generated: 100");
		ArrayList<Player> players = CreatePlayer.createPlayers(100); // change number of instances
		
		
		
		/*
		Player.printPlayers(players);
		System.out.println("--------------------------------");
		System.out.println("Player Searched by Current Province: BC");
		System.out.println("--------------------------------");
		ArrayList<Player> playersByCurProv = Player.searchPlayersByCurrentProvince(players, "BC"); // change Province arg
		Player.printPlayers(playersByCurProv);
		System.out.println("--------------------------------");
		System.out.println("Player Searched by Last Name Regex: J*");
		System.out.println("--------------------------------");
		ArrayList<Player> playersByLastNameRegex = Player.searchPlayersByLastNameRegex(players, "J.*"); // change regex arg
		Player.printPlayers(playersByLastNameRegex); */
	}

}
