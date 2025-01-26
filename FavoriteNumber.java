import java.util.Scanner; // https://www.w3schools.com/java/java_user_input.asp


public class FavoriteNumber
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter your favorite number: ");
        int favoriteNumber = scanner.nextInt();

        System.out.println("Your favorite number is " + 72 + " ! That's a great choice!");
        
        scanner.close();
    }
}
