package observer;

public interface Observable {

	void unsubscribe(Observer observer);
	
	void subscribe(Observer observer);
	
	void notifyObservers();
	
	String getUpdate();
	
}
