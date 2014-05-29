package ca.bcit.comp2613.a00578633.model;

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

	public Player() {

	}

	public Player(String firstName, String lastName, String currentProvince,
			String previousProvince, String currentTeam, String previousTeam,
			Integer shootingPerformance, Integer moneyEarned, Integer id) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.currentProvince = currentProvince;
		this.previousProvince = previousProvince;
		this.currentTeam = currentTeam;
		this.previousTeam = previousTeam;
		this.shootingPerformance = shootingPerformance;
		this.moneyEarned = moneyEarned;
		this.id = id;
	}

	@Override
	public String toString() {
		return "First name: " + firstName + ", Last name: " + lastName
				+ ", Current Province: " + currentProvince
				+ ", Previous Province: " + previousProvince
				+ ", Performance: " + shootingPerformance + ", Earnings: "
				+ moneyEarned + ", ID: " + id;
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

	public int getShootingPerformance() {
		return shootingPerformance;
	}

	public void setShootingPerformance(int shootingPerformance) {
		this.shootingPerformance = shootingPerformance;
	}

	public int getMoneyEarned() {
		return moneyEarned;
	}

	public void setMoneyEarned(int moneyEarned) {
		this.moneyEarned = moneyEarned;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

}
