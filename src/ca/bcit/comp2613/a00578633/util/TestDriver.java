package ca.bcit.comp2613.a00578633.util;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

import ca.bcit.comp2613.a00578633.model.Player;

public class TestDriver {

	public static void main(String[] args) throws Exception {
		System.out.println("Number of players generated: 25");
		ArrayList<Player> players = CreatePlayer.createPlayers(25); // change number of instances
		System.out.println();

		System.out.println("Players sorted by Current Province [ASC], Last Name [ASC], First Name [ASC]");
		sortProvinceLastNameFirstName(players);
		System.out.println();
		System.out.println("Players sorted by Performance [DESC], Earnings [DESC]");
		sortPerformanceEarnings(players);

	}

	/*
	 * Takes an ArrayList <Player> sorting them by currentProvince, lastName, then firstName in ASC order.
	 */
	public static void sortProvinceLastNameFirstName(ArrayList<Player> players) {
		ArrayList<Player> playerList = new ArrayList<>();
		playerList.addAll(players);

		Comparator<Player> list = new Comparator<Player>() {

			@Override
			public int compare(Player o1, Player o2) {
				int retval = o1.getCurrentProvince().compareTo(o2.getCurrentProvince());
				if (retval == 0) {
					retval = o1.getLastName().compareTo(o2.getLastName());
					if (retval == 0) {
						retval = o1.getFirstName().compareTo(o2.getFirstName());
					}
				}
				return retval;
			}
		};

		Collections.sort(playerList, list);
		for (Player player : playerList) {
			System.out.println(player);
		}
	}

	/*
	 * Takes an ArrayList <Player> sorting them by shootingPerformance and MoneyEarned in DESC order
	 */
	public static void sortPerformanceEarnings(ArrayList<Player> players) {
		ArrayList<Player> playerList = new ArrayList<>();
		playerList.addAll(players);

		Comparator<Player> list = new Comparator<Player>() {

			@Override
			public int compare(Player o1, Player o2) {
				int retval = o2.getShootingPerformance() - o1.getShootingPerformance();
				if (retval == 0) {
					retval = o2.getMoneyEarned() - o1.getMoneyEarned();
				}
				return retval;
			}
		};

		Collections.sort(playerList, list);
		for (Player player : playerList) {
			System.out.println(player);
		}
	}

}
