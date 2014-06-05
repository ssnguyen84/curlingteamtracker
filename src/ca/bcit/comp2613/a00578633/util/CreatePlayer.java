package ca.bcit.comp2613.a00578633.util;

import java.util.ArrayList;
import java.util.Random;

import ca.bcit.comp2613.a00578633.model.Player;
import ca.bcit.comp2613.a00578633.model.Position;

public class CreatePlayer {

	public static String RANDOM_NAMES = "SCOTT NGUYEN KEVIN MARTIN SANDRA SCHMIRLER JENNIFER JONES BRAD JACOBS KEVIN KOE RACHEL";
	public static String PROVINCES = "BC YT NWT NU AB SK MAN ONT QUE NB NFLD NS PEI";
	public static String TEAMS = "A B C D E F G H I J K L M N O P QQ R S T";

	public static ArrayList<Player> createPlayers(Integer num) throws Exception {

		ArrayList<Player> players = new ArrayList<>();
		String[] strs = RANDOM_NAMES.split("\\s");
		String[] prov = PROVINCES.split("\\s");
		String[] team = TEAMS.split("\\s");

		Position[] position = { Position.SKIP, Position.THIRD, Position.SECOND, Position.LEAD };

		Random rng = new Random();

		for (int i = 0; i < num; i++) {
			Player player = new Player();
			player.setId(i + 1);
			player.setFirstName(strs[rng.nextInt(13)]);
			player.setLastName(strs[rng.nextInt(13)]);
			player.setCurrentProvince(prov[rng.nextInt(13)]);
			player.setPreviousProvince(prov[rng.nextInt(13)]);
			player.setCurrentTeam(team[rng.nextInt(20)]);
			
			try{
				CreatePlayer.getTeamQQ(player);								// 1 out of 20 chance of being QQ - 5%
			} catch (TeamQQException e) {
				System.err.println("Caught RuntimeException: Player cannot be currently on Team QQ");
			}
			
			player.setPreviousTeam(team[rng.nextInt(20)]);
			player.setShootingPerformance(rng.nextInt(100));
			CreatePlayer.getPlayerPerformanceTest(player);  				// 1 out of 100 chance of being zero - 1%
			player.setMoneyEarned(rng.nextInt(1000));
			player.setPosition(position[rng.nextInt(4)]);
			players.add(player);			
		}	
		return players;		
	}
	/*
	 * Test Exception Method - not to be used after asn3
	 */
	public static void getPlayerPerformanceTest(Player player) throws PlayerPerformanceException {
		if(player.getShootingPerformance() == 0){
			System.out.println(player.toString());
			throw new PlayerPerformanceException();
		}	
	}
	
	/*
	 * Test Exception Method - not to be used after asn3
	 */
	public static void getTeamQQ(Player player) throws TeamQQException {          
		if(player.getCurrentTeam().equals("QQ")){
			System.out.println(player.toString());
			throw new TeamQQException();
		}
	}
}
