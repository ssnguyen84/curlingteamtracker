package ca.bcit.comp2613.a00578633.util;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

import ca.bcit.comp2613.a00578633.model.Player;

public class TestDriver{

	public static void main(String[] args) throws Exception {
		try{
			System.out.println("Number of players generated: 25");
			ArrayList<Player> players = CreatePlayer.createPlayers(25); // change number of instances
			//Player.printPlayers(players);
			
			System.out.println("Players sorted by Province, Last Name, First Name");
			Comparator<Player> compareProvinceLastNameFirstName = new Comparator<Player>(){
				
				@Override
				public int compare(Player o1, Player o2){
					int retval = o1.getCurrentProvince().compareTo(o2.getCurrentProvince());
					if(retval == 0){
					  retval = o1.getLastName().compareTo(o2.getLastName());
					  if (retval == 0) {
						retval = o1.getFirstName().compareTo(o2.getFirstName());
					  }
					}
					return retval;	
				}
			};
			
			Collections.sort(players, compareProvinceLastNameFirstName);
			for (Player player : players) {
				System.out.println(player);
			}
			/*
			ArrayList<Player> playersByCurProv = Player.searchPlayersByCurrentProvince(players, "BC"); // change Province arg
			Player.printPlayers(playersByCurProv);
			System.out.println("--------------------------------");
			System.out.println("Player Searched by Last Name Regex: J*");
			System.out.println("--------------------------------");
			ArrayList<Player> playersByLastNameRegex = Player.searchPlayersByLastNameRegex(players, "J.*"); // change regex arg
			Player.printPlayers(playersByLastNameRegex);		
			*/
			
		} catch (PlayerPerformanceException e) {
			System.err.println("Caught PlayerPerformanceException: Player cannot have 0 performance"  );
		}
	}

}
