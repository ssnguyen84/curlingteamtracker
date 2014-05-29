package ca.bcit.comp2613.a00578633.util;

import java.util.ArrayList;
import java.util.Random;
import ca.bcit.comp2613.a00578633.model.Player;

public class CreateHelper {

	public static String RANDOM_NAMES = "SCOTT NGUYEN KEVIN MARTIN SANDRA SCHMIRLER JENNIFER JONES BRAD JACOBS KEVIN KOE RACHEL";
	public static String PROVINCES = "BC YT NWT NU AB SK MAN ONT QUE NB NFLD NS PEI";
	public static String TEAMS = "A B C D E F G H I J K L M";

	public static ArrayList<Player> createPlayers(Integer num) {
		
		ArrayList<Player> players = new ArrayList<>();
		String[] strs = RANDOM_NAMES.split("\\s");
		String[] prov = PROVINCES.split("\\s");
		String[] team = TEAMS.split("\\s");

		Random rng = new Random();

		for (int i = 0; i < num; i++) {
			Player player = new Player();
			player.setId(i+1);
			player.setFirstName(strs[rng.nextInt(13)]);
			player.setLastName(strs[rng.nextInt(13)]);
			player.setCurrentProvince(prov[rng.nextInt(13)]);
			player.setPreviousProvince(prov[rng.nextInt(13)]);
			player.setCurrentTeam(team[rng.nextInt(13)]);
			player.setPreviousTeam(team[rng.nextInt(13)]);
			player.setShootingPerformance(rng.nextInt(100));
			player.setMoneyEarned(rng.nextInt(1000));
			players.add(player);
		}
		return players;
	}

	public static void printPlayers(ArrayList<Player> players) {
		for (Player player : players) {
			System.out.println(player);
		}
	}
	
	public static ArrayList<Player> searchPlayersByCurrentProvince(ArrayList<Player> players, 
			String currentProvince) {
		ArrayList<Player> searchCurProv = new ArrayList<>();
		for (Player player : players) {
			if (player.getCurrentProvince().equals(currentProvince)) {
				searchCurProv.add(player);
			}
		}
		return searchCurProv;
	}

	public static ArrayList<Player> searchPlayersByLastNameRegex(
			ArrayList<Player> players, String regex) {
		ArrayList<Player> searchPlayerByLastNameRegex = new ArrayList<>();
		for (Player player : players) {
			 if (player.getLastName().matches(regex)) {
				 System.out.println(player);
			 }
		}
		return searchPlayerByLastNameRegex;
	}

}
