package org.Scanner;

import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String correctUser = "admin";
        String correctPassword = "1234";
        int tries = 0;

        while (tries < 3) {
            System.out.println("Type your username");
            String user = sc.nextLine();
            System.out.println("Type your password");
            String password = sc.nextLine();

            if (user.equals(correctUser) && password.equals(correctPassword)) {
                System.out.println("Adelante mi pana");
                break;
            } else
                System.out.println("User OR Password  are incorrect. Please, try again. Remaining tries: " + (2 - tries));
            tries++;
        }
        if (tries == 3) {
            System.out.println("Lo siento compai, este no eres tú. This pc will explote");
        }
        sc.close();
        //Realizamos cambios
    }

}