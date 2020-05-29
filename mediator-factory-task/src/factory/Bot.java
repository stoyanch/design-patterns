package factory;

import mediator.MessageMediator;
import mediator.User;
import utils.UserType;

public class Bot extends User {

	private static Bot singletonBot;

    private Bot(MessageMediator mediator, UserType type) {
        super(mediator, type);
        mediator.addUser(this);
    }

    public static Bot getSingletonBot(MessageMediator mediator, UserType type) {
        if (singletonBot == null) {
            singletonBot = new Bot(mediator, type);
        }
        return singletonBot;
    }

    @Override
    public void send(String message) {
        System.out.println(this.name + " sends: " + message);
        mediator.sendMessage(message, this);
    }

    @Override
    public void receive(String message, String senderName) {
        System.out.println(this.name + " receives: " + message);
        if (message.equals("cat") || message.equals("CAT")) {
            mediator.removeUser(senderName);
            send("User '" + senderName + "' was kicked from the room. 'cat' is a forbidden word in this room!");
        }
    }

}
