import java.util.Scanner;

public class JavaBasics_Part1_Program2 {
    private static final float PI = 3.14f;

    public static void main(String[] args) {
        int radiusOfCircle;
        Scanner sc = new Scanner(System.in);
        System.out.println("Area and Perimeter of circle");
        System.out.println("Enter radius of circle :");
        radiusOfCircle = sc.nextInt();
        System.out.println("Area of circle of radius " + radiusOfCircle + " is " + areaOfCircle(radiusOfCircle));
        System.out.println("Perimeter of circle of radius " + radiusOfCircle + " is " + perimeterOfCircle(radiusOfCircle));
    }

    private static float areaOfCircle(int radius) {
        return PI * radius * radius;
    }

    private static float perimeterOfCircle(int radius) {
        return 2 * PI * radius;
    }
}
