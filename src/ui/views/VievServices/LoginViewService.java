package src.ui.views.VievServices;

import src.backend.model.user.User;
import src.backend.service.userservice.UserService;
import src.backend.service.userservice.UserServiceImpl;
import src.ui.utils.InputUtils;

public class LoginViewService {
	private static final UserService userService = new UserServiceImpl();
	
	public static void personal() {
	
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
		
	}
}
