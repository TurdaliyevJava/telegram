package src.ui.views;

import src.backend.dto.LoginDTO;
import src.backend.model.user.User;
import src.backend.service.groupservice.GroupService;
import src.backend.service.groupservice.GroupServiceImpl;
import src.backend.service.messageservice.MessageService;
import src.backend.service.messageservice.MessageServiceImpl;
import src.backend.service.userservice.UserService;
import src.backend.service.userservice.UserServiceImpl;
import src.ui.utils.InputUtils;
import src.ui.views.VievServices.LoginViewService;

import static src.ui.utils.TxTColorStyleUtil.*;

public class LoginView {
	private static final UserService userService = new UserServiceImpl();
	private static final GroupService groupService = new GroupServiceImpl();
	private static final MessageService messageService  = new MessageServiceImpl();
	
	public static void DisplayMenu() {
		System.out.println("\t\t\t\t\t" + ANSI_CYAN + ANSI_BOLD + ANSI_ITALIC + " Welcome our Telegram DEMO app\uD83D\uDCA1");
		System.out.println("""
				1 - Log In
				2 - Sign Up
				
				""");
	}
	public static void signIn() {
		LoginDTO loginDTO = new LoginDTO(InputUtils.scannerStr("Enter phone number: "),InputUtils.scannerStr("Enter nick name: "), InputUtils.scannerStr("Enter your password: "));
		User currentUser = userService.login(loginDTO);
		if (currentUser != null) {
			telegramApps();
		} else {
			InputUtils.notCreated();
		}
	}
	private static void telegramApps() {
		while (true){
			InputUtils.tgMenu();
			int choose = InputUtils.scannerInt("Choose: ");
			switch (choose) {
				case 1 -> LoginViewService.personal();
				case 2 -> LoginViewService.groups();
				case 3 -> LoginViewService.searches();
				case 4 -> LoginViewService.newGroup();
				case 0 -> {
					return;
				}
				default -> System.out.println("wrong option");
			}
		}
	}
	
	public static void signUp() {
		String num = InputUtils.scannerStr("\nPhone number: ");
		String users = InputUtils.scannerStr("\nUser name: ");
		String pas = InputUtils.scannerStr("\nPassword: ");
		boolean numExists = userService.getUserList().stream().anyMatch(user -> user.getPhonenum().equals(num));
		if (numExists) {
			InputUtils.notCreatedNumber();
		} else {
			boolean userExists = userService.getUserList().stream().anyMatch(user -> user.getUsername().equals(users));
			if (userExists) {
				InputUtils.notCreatedUsername();
			} else {
				User newUser = new User(num, users, pas);
				if (userService.add(newUser)) {
					InputUtils.created();
				} else {
					InputUtils.notCreated();
				}
			}
		}
	}
}
