package ca.bcit.comp2613.a00578633.model;

public class Team {

	private String teamName;
	private String currentTeammates; // should be arrayList
	private String provinceRepresentation;
	private Integer standing;
	private Integer moneyEarned;

	// private String eventsAttended; should be arrayList

	public Team() {

	}

	public Team(String teamName, String currentTeammates,
			String provinceRepresentation, Integer standing, Integer moneyEarned) {
		super();
		this.teamName = teamName;
		this.currentTeammates = currentTeammates;
		this.provinceRepresentation = provinceRepresentation;
		this.standing = standing;
		this.moneyEarned = moneyEarned;
	}

	@Override
	public String toString() {
		return "Team Name: " + teamName + ", ";
	}

	public String getTeamName() {
		return teamName;
	}

	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}

	public String getCurrentTeammates() {
		return currentTeammates;
	}

	public void setCurrentTeammates(String currentTeammates) {
		this.currentTeammates = currentTeammates;
	}

	public String getProvinceRepresentation() {
		return provinceRepresentation;
	}

	public void setProvinceRepresentation(String provinceRepresentation) {
		this.provinceRepresentation = provinceRepresentation;
	}

	public int getStanding() {
		return standing;
	}

	public void setStanding(int standing) {
		this.standing = standing;
	}

	public int getMoneyEarned() {
		return moneyEarned;
	}

	public void setMoneyEarned(int moneyEarned) {
		this.moneyEarned = moneyEarned;
	}

}
