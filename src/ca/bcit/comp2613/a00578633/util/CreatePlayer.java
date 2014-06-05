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
			player.setPreviousTeam(team[rng.nextInt(20)]);
			player.setShootingPerformance(rng.nextInt(100)); 
			player.setMoneyEarned(rng.nextInt(1000));
			player.setPosition(position[rng.nextInt(4)]);
			try{
				if(player.getShootingPerformance() == 0){ 		// 1 out of 100 chance of being zero
					throw new PlayerPerformanceException();
				}
				if(player.getCurrentTeam().equals("QQ")){				// 1 out of 20 chance of QQ
					throw new TeamQQException();
				}
				
			} catch (PlayerPerformanceException e){
				System.out.println(player.toString());
				System.out.println("Error: Player Peformance cannot be zero");
				System.exit(0);
			} catch (TeamQQException e){
				System.out.println(player.toString());
				System.out.println("Team QQ should not exist");
				System.exit(0);
			}
			players.add(player);			
		}
		
		return players;		
	}

}
