import java.util.ArrayList;

import command.Command;
import command.Exercise;
import command.GoDownCommand;
import command.StandUpCommand;
import command.Trainer;
import observer.Trainee;
import observer.Viewer;

public class Main {

	public static void main(String[] args) {
		
		Trainer trainer = new Trainer();
        Exercise exercise = new Exercise();
        
        Command standUpCommand = new StandUpCommand(exercise);
        Command goDownCommand = new GoDownCommand(exercise);

        Trainee trainee = new Trainee();
        
        Viewer firstViewer = new Viewer("First Viewer");
        Viewer secondViewer = new Viewer("Second Viewer");
        Viewer thirdViewer = new Viewer("Third Viewer");

        ArrayList<Viewer> viewers = new ArrayList<Viewer>();
        viewers.add(firstViewer);
        viewers.add(secondViewer);
        viewers.add(thirdViewer);
        
        for (Viewer viewer : viewers) {
        	trainee.subscribe(viewer);
        }

        trainer.setCommand(standUpCommand);
        trainer.returnMessage();
        trainee.doExercise(trainer.setExercise());

        trainer.setCommand(goDownCommand);
        trainer.returnMessage();
        trainee.doExercise(trainer.setExercise());
	}

}
