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

import static src.ui.utils.TxTColorStyleUtil.*;



public class Main {
    private static UserService userService = new UserServiceImpl();
    private static GroupService groupService = new GroupServiceImpl();
    private static MessageService messageService  = new MessageServiceImpl();
    private static User currentUser;
    public static void main(String[] args) {
        System.out.println("\t\t\t\t\t" + ANSI_CYAN + ANSI_BOLD + ANSI_ITALIC + " Welcome our Telegram DEMO app\uD83D\uDCA1");
        while (true) {
            InputUtils.mainMenu();
            int choose = InputUtils.scannerInt("Choose: ");
            switch (choose) {
                case 1 -> login();
                case 2 -> signUp();
                case 0 -> {
                    return;
                }
                default -> System.out.println("wrong option");
            }
        }
    }

    private static void login() {
        LoginDTO loginDTO = new LoginDTO(InputUtils.scannerStr("\nPhone number: "), InputUtils.scannerStr("\nUser name: "), InputUtils.scannerStr("\nPassword: "));
        currentUser = userService.login(loginDTO);
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
                case 1 -> personal();
                case 2 -> groups();
                case 3 -> searches();
                case 4 -> newGroup();
                case 0 -> {
                    return;
                }
                default -> System.out.println("wrong option");
            }
        }
    }

    private static void newGroup() {
    }

    private static void searches() {
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

    private static void sendMessage() {
        String receiverUsername = InputUtils.scannerStr("Enter the username of the receiver: ");
        String messageContent = InputUtils.scannerStr("Enter your message: ");
        User receiver = userService.getUserByUsername(receiverUsername);

    }

    private static void groups() {
    }

    private static void personal() {
    }

    private static void signUp() {
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
