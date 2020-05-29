package command;

public class StandUpCommand implements Command {

	private Exercise exercise;
	
	public StandUpCommand(Exercise exercise) {
		this.exercise = exercise;
	}

	@Override
	public String executeCommand() {
		return this.exercise.standUp();
	}
	
}
