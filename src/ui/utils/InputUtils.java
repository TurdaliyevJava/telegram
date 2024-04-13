package src.ui.utils;

import java.util.Scanner;

public interface InputUtils {
    static int scannerInt(String message) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(message);
        return scanner.nextInt();
    }
    static String scannerStr(String message) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(message);
        return scanner.nextLine();
    }

    static void mainMenu() {
        System.out.println("""
            
                1. Log In
                2. Sign Up
                0. Exit
                """);
    }

    static void created() {
        System.out.println("completed successfully");
    }

    static void notCreated() {
        System.out.println("did not complete successfully");
    }

    static void tgMenu() {
        System.out.println("""
            
                1. Personal
                2. Groups
                3. Search 👀👀
                4. New group
                0. Exit
                """);
    }



    static void notCreatedUsername() {
        System.out.println("This username is busy");
    }

    static void notCreatedNumber() {
        System.out.println("This phone number is busy");
    }


    static void groupMenu() {
        System.out.println("""
            
                1. Group List
                2. Joined group
                0. Exit
                """);
    }
}
