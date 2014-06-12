package ca.bcit.comp2613.a00578633.model;

public class Team {

	private String teamName;
	private String provinceRepresentation;
	private Integer standing;
	private Integer moneyEarned;
	private Integer id;

	public Team() {

	}

	public Team(String teamName, String provinceRepresentation, Integer standing, Integer moneyEarned, Integer id) {
		super();
		this.teamName = teamName;
		this.provinceRepresentation = provinceRepresentation;
		this.standing = standing;
		this.moneyEarned = moneyEarned;
		this.id = id;
	}

	@Override
	public String toString() {
		return "Team Name: " + teamName + ", Players: " + ", Province: " + provinceRepresentation + ", Standing: " + standing + ", Money Earned: "
				+ moneyEarned;
	}

	public String getTeamName() {
		return teamName;
	}

	public void setTeamName(String teamName) {
		this.teamName = teamName;
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

	public void setStanding(Integer standing) {
		this.standing = standing;
	}

	public int getMoneyEarned() {
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

}
