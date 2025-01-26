import java.util.Scanner; // https://www.w3schools.com/java/java_user_input.asp




public class Temperature
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the temperature in Fahrenheit: ");
        double fahrenheit = scanner.nextDouble();

        double celsius = ((fahrenheit - 32) * 5) / 9;

        System.out.printf("The temperature %.2f°F in Celsius is %.2f°C.%n", fahrenheit, celsius);

        scanner.close();
    }
}