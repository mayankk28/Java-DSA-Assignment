import java.util.Scanner;

public class JavaBasics_Part2_Program8 {
    public static void main(String[] args) {
        int number;
        Scanner sc = new Scanner(System.in);
        System.out.println("Program to find factorial of a given number");
        System.out.println("Enter a number to find factorial");
        number = sc.nextInt();
        System.out.println("Factorial of " + number + " is " + findFactorial(number));
    }

    /*
        Method to find factorial of a given number
     */
    private static int findFactorial(int number) {
        int factorial = 1;
        for (int index = number; index >= 2; index--) {
            factorial *= index;
        }
        return factorial;
    }
}
