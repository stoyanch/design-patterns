package command;

public class GoDownCommand implements Command {

	private Exercise exercise;
	
	public GoDownCommand(Exercise exercise) {
		this.exercise = exercise;
	}

	@Override
	public String executeCommand() {
		return this.exercise.goDown();
	}
	
}
