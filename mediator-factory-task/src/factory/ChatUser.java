package factory;

import mediator.MessageMediator;
import mediator.User;
import utils.UserType;

public class ChatUser extends User {

	private final String ADD_BOT_COMMAND = "addBot";

    public ChatUser(MessageMediator mediator, UserType userType) {
        super(mediator, userType);
        mediator.addUser(this);
    }

    @Override
    public void send(String message) {
        System.out.println(this.name + " sends: " + message);
        mediator.sendMessage(message, this);
        
        if (message.equals(ADD_BOT_COMMAND)) {
            ChatFactory chatFactory = new ChatFactory();
            chatFactory.createUser(mediator, UserType.BOT, "ChatBot");
        }
    }

    @Override
    public void receive(String message, String senderName) {
        System.out.println(this.name + " received: " + message);
    }

}
