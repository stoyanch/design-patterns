package factory;

import mediator.MessageMediator;
import mediator.User;
import utils.UserType;

public class ChatFactory {

	public User createUser(MessageMediator mediator, UserType userType, String userName) {
		User user = null;

		switch (userType) {
			case BOT:
				user = Bot.getSingletonBot(mediator, userType);
				user.setName(userName);
				break;
				
			case USER:
				user = new ChatUser(mediator, userType);
				user.setName(userName);
				break;
				
			default:
				break;
		}

		return user;
	}

}
