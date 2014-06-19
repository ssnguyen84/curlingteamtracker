package ca.bcit.comp2613.a00578633.model;

import java.util.ArrayList;

import org.apache.log4j.Logger;

import ca.bcit.comp2613.a00578633.util.TestDriver;

public class Player {

	private String firstName;
	private String lastName;
	private String currentProvince;
	private String previousProvince;
	private String currentTeam;
	private String previousTeam;
	private Integer shootingPerformance;
	private Integer moneyEarned;
	private Integer id;
	private Position position;
	
	public Player(){
		
	}

	public Player(String firstName, String lastName, String currentProvince) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.currentProvince = currentProvince;
	}
	
	public Player(String firstName, String lastName, String currentProvince, String previousProvince, String currentTeam, String previousTeam,
			Integer shootingPerformance, Integer moneyEarned, Position position, Integer id) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.currentProvince = currentProvince;
		this.previousProvince = previousProvince;
		this.currentTeam = currentTeam;
		this.previousTeam = previousTeam;
		this.shootingPerformance = shootingPerformance;
		this.moneyEarned = moneyEarned;
		this.position = position;
		this.id = id;
	}

	@Override
	public String toString() {
		return "ID: " + id + ", First name: " + firstName + ", Last name: " + lastName + ", Current Province: " + currentProvince
				+ ", Previous Province: " + previousProvince + ", Current Team: " + currentTeam + ", Previous Team: " + previousTeam
				+ ", Performance: " + shootingPerformance + ", Earnings: " + moneyEarned + ", Position: " + position;
	}

	public static ArrayList<Player> searchPlayersByCurrentProvince(ArrayList<Player> players, String currentProvince) {		
		ArrayList<Player> searchCurProv = new ArrayList<>();
		for (Player player : players) {
			if (player.getCurrentProvince().equals(currentProvince)) {
				searchCurProv.add(player);
			}
		}
		return searchCurProv;
	}

	public static ArrayList<Player> searchPlayersByLastNameRegex(ArrayList<Player> players, String regex) {
		Logger log = Logger.getLogger(TestDriver.class);
		ArrayList<Player> searchPlayerByLastNameRegex = new ArrayList<>();
		for (Player player : players) {
			if (player.getLastName().matches(regex)) {
				log.info(player);
			}
		}
		return searchPlayerByLastNameRegex;
	}

	public static void prIntegerPlayers(ArrayList<Player> players) {
		Logger log = Logger.getLogger(TestDriver.class);
		for (Player player : players) {
			log.info(player);
		}
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getCurrentProvince() {
		return currentProvince;
	}

	public void setCurrentProvince(String currentProvince) {
		this.currentProvince = currentProvince;
	}

	public String getPreviousProvince() {
		return previousProvince;
	}

	public void setPreviousProvince(String previousProvince) {
		this.previousProvince = previousProvince;
	}

	public String getCurrentTeam() {
		return currentTeam;
	}

	public void setCurrentTeam(String currentTeam) {
		this.currentTeam = currentTeam;
	}

	public String getPreviousTeam() {
		return previousTeam;
	}

	public void setPreviousTeam(String previousTeam) {
		this.previousTeam = previousTeam;
	}

	public Integer getShootingPerformance() {
		return shootingPerformance;
	}

	public void setShootingPerformance(Integer shootingPerformance) {
		this.shootingPerformance = shootingPerformance;
	}

	public Integer getMoneyEarned() {
		return moneyEarned;
	}

	public void setMoneyEarned(Integer moneyEarned) {
		this.moneyEarned = moneyEarned;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Position getPosition() {
		return position;
	}

	public void setPosition(Position position) {
		this.position = position;
	}

}
