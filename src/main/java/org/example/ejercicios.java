package org.example;

import java.util.Scanner;

public class ejercicios {
// 5. Programa que lee por teclado el valor del radio de una circunferencia y calcula y muestra
//por pantalla la longitud y el área de la circunferencia.
//Longitud de la circunferencia = 2*PI*Radio, Area de la circunferencia = PI*Radio^2

    // Falta corregir
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double radio, Circunferencia, Longitud;
        System.out.printf("Imprime la Circuferencia y Longitud");
        sc.nextLine();
        radio = sc.nextDouble();
        Circunferencia = 2* Math.PI * radio;
        Longitud = 2* Math.PI * radio;
        System.out.println("Longitud de la circunferencia " + radio);
        System.out.println("Longitud de la circunferencia " + radio);
    }


    /*public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double gradosC, gradosF;
        System.out.println("Type Celsius");
        sc.nextLine();
        gradosC = sc.nextDouble();
        gradosF = 32 + ( 9 * gradosC / 5);
        System.out.println(gradosC + "ªC =" + gradosF + "ªF");
    }*/

    /*public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String correctUser = "admin";
        String correctPassword = "1234";
        int tries = 0;

        while (tries < 3){
            System.out.println("Type your username");
            String user = sc.nextLine();
            System.out.println("Type your password");
            String password = sc.nextLine();

            if (user.equals(correctUser) && password.equals(correctPassword)){
                System.out.println("Correct user");
                break;}
            else System.out.println("User and password incorrect. Try again. Remaining tries: " + (2 - tries));
            tries++;
            }
        if (tries == 3){
            System.out.println("You´ve exceeded the max amount of tries. This pc will explote");
        }
        sc.close();
        }*/

    }




    /*public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    double Cms = 1.70;
        System.out.println("Type your height");
        Cms = sc.nextInt();
        if (Cms >= 1.70){
            System.out.println("You re tall");
        }
        else if (Cms <= 60){
            System.out.println("You are smol");
        }*/

        /*Scanner sc = new Scanner(System.in);
        int number;
        System.out.println("Type an Int number");
        number = sc.nextInt();
        System.out.println("Double of " + number + " is "  +  2*number);*/

        /*Scanner sc = new Scanner(System.in);
        String chain;
        System.out.println("Type your name");
        chain = sc.nextLine();
        System.out.println("Good morning" + chain);*/

        /*int n1, n2;
        Scanner sc = new Scanner(System.in);
        System.out.println("Type a number");
        n1 = sc.nextInt();
        System.out.println("Type another number");
        n2 = sc.nextInt();
        System.out.println("You´ve typed" + n1 + "y" + n2);*/









