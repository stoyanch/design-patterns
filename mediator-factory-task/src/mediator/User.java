package mediator;

import utils.UserType;

public abstract class User {

    protected String name;
    protected UserType userType;
    protected MessageMediator mediator;

    public User(MessageMediator mediator, UserType userType) {
        this.mediator = mediator;
        this.userType = userType;
    }

    public abstract void send(String message);

    public abstract void receive(String message, String senderName);

    public UserType getUserType() {
        return userType;
    }

    public void setUserType(UserType userType) {
        this.userType = userType;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
}
