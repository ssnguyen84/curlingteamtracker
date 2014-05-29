package ca.bcit.comp2613.a00578633;

import java.util.ArrayList;

import ca.bcit.comp2613.a00578633.model.Player;
import ca.bcit.comp2613.a00578633.util.CreateHelper;

public class TestDriver {

	public static void main(String[] args) {
		System.out.println("Number of players generated: 50");	
		ArrayList<Player> players = CreateHelper.createPlayers(50); //change number of instances
		CreateHelper.printPlayers(players);
		System.out.println("--------------------------------");
		System.out.println("Player Searched by Current Province: BC");
		System.out.println("--------------------------------");
		ArrayList<Player> playersByCurProv = CreateHelper.searchPlayersByCurrentProvince(players, "BC"); // change Province arg
		CreateHelper.printPlayers(playersByCurProv);
		System.out.println("--------------------------------");
		System.out.println("Player Searched by Last Name Regex: J*");
		System.out.println("--------------------------------");
		ArrayList<Player> playersByLastNameRegex = CreateHelper.searchPlayersByLastNameRegex(players, "J.*"); //change regex arg
		CreateHelper.printPlayers(playersByLastNameRegex);		
	}

}


