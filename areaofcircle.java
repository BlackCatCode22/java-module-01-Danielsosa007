import java.util.Scanner; // https://www.w3schools.com/java/java_user_input.asp


public class areaofcircle
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Please enter the radius of the circle: ");
        double radius = scanner.nextDouble();
        
        double area = Math.PI * Math.pow(radius, 2);
        
        System.out.println("The area of the circle with radius " + radius + " is: " + area);

        scanner.close();
    }
}
