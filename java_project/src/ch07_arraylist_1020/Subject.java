package ch07_arraylist_1020;

public class Subject {
	
	private String name;
	private int scorePoint;
	private int lunchMenuID;
	private String lunchMenu;
	
	public String getLunchMenu() {
		return lunchMenu;
	}
	public void setLunchMenu(String lunchMenu) {
		this.lunchMenu = lunchMenu;
	}
	public int getLunchMenuID() {
		return lunchMenuID;
	}
	public void setLunchMenuID(int lunchMenuID) {
		this.lunchMenuID = lunchMenuID;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getScorePoint() {
		return scorePoint;
	}
	public void setScorePoint(int scorePoint) {
		this.scorePoint = scorePoint;
	}
}