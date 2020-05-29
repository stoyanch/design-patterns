import factory.ChatFactory;
import mediator.ChatMessageMediator;
import mediator.MessageMediator;
import mediator.User;
import utils.UserType;

public class Main {

	public static void main(String[] args) {
		
		MessageMediator mediator = new ChatMessageMediator();
        ChatFactory chatFactory = new ChatFactory();
        
        User firstUser = chatFactory.createUser(mediator, UserType.USER, "Didi");
        User secondUser = chatFactory.createUser(mediator, UserType.USER, "George");
        User thirdUser = chatFactory.createUser(mediator, UserType.USER, "Alexander");
        
        firstUser.send("Hello World");
        secondUser.send("Test message");
        firstUser.send("addBot");
        thirdUser.send("cat");
	}

}
