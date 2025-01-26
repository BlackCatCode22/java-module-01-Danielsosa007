// SimpleGreeting.java
// DS 1/26/25
// demo for CIT-63 class (online)
// refactor to rename the default "Main" to something meaningful to me

// Scanner class is here:
// https://www.w3schools.com/java/java_user_input.asp

import java.util.Scanner;

public class SimpleGreeting
{
    public static void main(String[] args) {
        System.out.println("\n\n****** Welcome to my Simple Greeting Program! ****** \n\n");

        // Create a scanner object for user input
        Scanner myObj = new Scanner(System.in);
        System.out.println("DanielSosa");


        String userName = myObj.nextLine();
        System.out.println("Username is: DanielSosa");
    }
}