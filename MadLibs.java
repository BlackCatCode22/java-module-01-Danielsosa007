import java.util.Scanner; // https://www.w3schools.com/java/java_user_input.asp

public class MadLibs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user for inputs
        System.out.print("Enter a noun: ");
        String noun = scanner.nextLine();

        System.out.print("Enter a verb: ");
        String verb = scanner.nextLine();

        System.out.print("Enter an adjective: ");
        String adjective = scanner.nextLine();

        System.out.print("Enter an adverb: ");
        String adverb = scanner.nextLine();

        // Create the story
        String story = "Once upon a time, there was a " + adjective + " " + noun + " who loved to " + verb + " " + adverb + ". It was the most amazing thing anyone had ever seen!";

        // Display the story
        System.out.println("\nHere is your story:");
        System.out.println(story);

        scanner.close();
    }
}