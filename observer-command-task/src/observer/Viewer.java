package observer;

public class Viewer implements Observer {

	private String name;
    private Observable trainee;

    public Viewer(String name) {
        this.name = name;
    }
    
	@Override
	public void updateState() {
		if(trainee != null) {
		String exercise = trainee.getUpdate();
        System.out.println(this.name + " updated exercise to " + exercise);
		} else {
			System.out.println("Some error occurred");
		}
	}

	@Override
	public void setTrainee(Observable trainee) {
		this.trainee = trainee;
	}

	public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
}
