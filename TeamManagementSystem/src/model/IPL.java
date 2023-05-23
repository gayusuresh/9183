package model;

public class IPL 
{
	private int teamid;
	private String tname;
	private String city;
	private String state;
	public IPL()
	{
		
	}
	public IPL(int teamid, String tname, String city, String state) {
		super();
		this.teamid = teamid;
		this.tname = tname;
		this.city = city;
		this.state = state;
	}
	public int getTeamid() {
		return teamid;
	}
	public void setTeamid(int teamid) {
		this.teamid = teamid;
	}
	public String getTname() {
		return tname;
	}
	public void setTname(String tname) {
		this.tname = tname;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	@Override
	public String toString() {
		return "IPL [teamid=" + teamid + ", tname=" + tname + ", city=" + city + ", state=" + state + "]";
	}

}
