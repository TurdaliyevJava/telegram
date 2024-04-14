package src.ui.main;

import src.backend.dto.LoginDTO;
import src.backend.model.message.Message;
import src.backend.model.user.User;
import src.backend.service.groupservice.GroupService;
import src.backend.service.groupservice.GroupServiceImpl;
import src.backend.service.messageservice.MessageService;
import src.backend.service.messageservice.MessageServiceImpl;
import src.backend.service.userservice.UserService;
import src.backend.service.userservice.UserServiceImpl;
import src.ui.utils.InputUtils;
import src.ui.views.ContactView;
import src.ui.views.LoginView;

import static src.ui.utils.TxTColorStyleUtil.*;

public class Main {
    private static final UserService userService = new UserServiceImpl();
    private static final GroupService groupService = new GroupServiceImpl();
    private static final MessageService messageService  = new MessageServiceImpl();
	private static User currentUser;
    public static void main(String[] args) {
		
	    LoginView.DisplayMenu();
		while (true){
			switch (InputUtils.scannerInt("Choose: ")) {
				case 1->{
					LoginView.signIn();
				}
				case 2->{
					LoginView.signUp();
				}
				case 0->{
				
				}
				default ->{
					System.out.println("Sorry that's wrong option! ---- TRY AGAIN");
				}
			}
		}
	
		
	}
}
