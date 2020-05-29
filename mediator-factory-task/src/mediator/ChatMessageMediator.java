package mediator;

import java.util.ArrayList;
import java.util.List;

public class ChatMessageMediator implements MessageMediator {
	
    private List<User> users;

    public ChatMessageMediator() {
        this.users = new ArrayList<>();
    }

    @Override
    public void sendMessage(String message, User user) {
    	// message should not be received by the user sending it
        for (User u : this.users) {
            if (u != user) {
                u.receive(message, user.name);
            }
        }
    }

    @Override
    public void addUser(User user) {
        this.users.add(user);
    }

    @Override
    public void removeUser(String username) {
        User userToRemove = this.users.stream()
                .filter(user -> username.equals(user.name))
                .findFirst()
                .get();
        
        this.users.remove(userToRemove);
    }
}