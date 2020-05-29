package command;

public class Exercise {
	
	private boolean isUp;
	
	public String standUp() {
		isUp = true;
		return "Stand Up!";
	}
	
	public String goDown() {
		isUp = false;
		return "Go Down!";
	}
	
}
