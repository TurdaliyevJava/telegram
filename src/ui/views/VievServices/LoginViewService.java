package src.ui.views.VievServices;

import src.backend.enums.MessageRole;
import src.backend.model.chat.Chat;
import src.backend.model.message.Message;
import src.backend.model.user.User;
import src.backend.service.chatservice.ChatService;
import src.backend.service.chatservice.ChatServiceImpl;
import src.backend.service.messageservice.MessageService;
import src.backend.service.messageservice.MessageServiceImpl;
import src.backend.service.userservice.UserService;
import src.backend.service.userservice.UserServiceImpl;
import src.ui.utils.InputUtils;

import java.util.List;

public class LoginViewService {
	private static final UserService userService = new UserServiceImpl();
    private static final ChatService chatService = new ChatServiceImpl();
    private static final MessageService messagService = new MessageServiceImpl();

	
	public static void personal() {
        while (true) {
            List<Message> messageList = messagService.getList();
            for (Message message : messageList) {
				System.out.println(message);
			}
			int i = InputUtils.scannerInt("choose: ");
		}


	
	}
	public static void groups() {
	
	}
	public static void newGroup() {
	}
	
	public static void searches() {
		String usernameToSearch = InputUtils.scannerStr("Enter the username to search: ");
		boolean userFound = false;
		for (User user : userService.getUserList()) {
			if (user.getUsername().equals(usernameToSearch)) {
				userFound = true;
				System.out.println("User Found: " + user.getUsername());
				if(userFound){
					while (true){
						System.out.println("\n1.Write a message");
						System.out.println("0.Return to menu");
						int choose = InputUtils.scannerInt("\nchoose: ");
						switch (choose){
							case 1 -> sendMessage();
							case 0 ->{
								return;
							}
						}
					}
				}
				break;
			}
		}
		if (!userFound) {
			System.out.println("User with username '" + usernameToSearch + "' not found.");
		}
	}
	public static void sendMessage() {
        String receiverUsername = InputUtils.scannerStr("Enter the username of the receiver: ");
        String messageContent = InputUtils.scannerStr("Enter your message: ");
        User receiver = userService.getUserByUsername(receiverUsername);
        User getuser = userService.getUserByUsername(receiverUsername);
        if (receiver != null) {
            Message message =  new Message(messageContent, MessageRole.PERSONAL,receiver.getID(),getuser.getID());
            messagService.add(message);
            InputUtils.created();
        } else {
            System.out.println("Receiver not found.");
        }
		
	}
}
