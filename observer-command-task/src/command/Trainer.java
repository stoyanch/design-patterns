package command;

public class Trainer {
	
	private Command command;

    public void setCommand(Command command) {
        this.command = command;
    }

    public String setExercise() {
        return this.command.executeCommand();
    }
    
    public void returnMessage() { 
    	if(this.command instanceof GoDownCommand) {
    		System.out.println("\nNext exercise is to go down!\n");
    	}
    	else {
    		System.out.println("\nNext exercise is to stand up!\n");
    	}
    }
}
