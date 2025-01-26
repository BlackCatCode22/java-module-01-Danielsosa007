import java.util.Scanner; //https://www.w3schools.com/java/java_user_input.asp

public class CharDetails {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user for a single character
        System.out.print("Enter a single character: ");
        String input = scanner.next();

        // Validate input length
        if (input.length() != 1) {
            System.out.println("Error: Please enter exactly one character.");
        } else {
            char ch = input.charAt(0);

            // Display Unicode value
            System.out.println("Unicode value: " + (int) ch);

            // Check if the character is a letter or a digit
            if (Character.isLetter(ch)) {
                System.out.println("The character is a letter.");
            } else if (Character.isDigit(ch)) {
                System.out.println("The character is a digit.");
            } else {
                System.out.println("The character is neither a letter nor a digit.");
            }
        }

        scanner.close();
    }
}