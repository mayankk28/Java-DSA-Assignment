import java.util.Scanner;

public class JavaBasics_Part2_Program7 {
    public static void main(String[] args) {

        int numberOfTerms;
        Scanner sc = new Scanner(System.in);
        System.out.println("Program to print fibonacci series upto n terms");
        System.out.println("Enter the number of terms for fibonacci series");
        numberOfTerms = sc.nextInt();
        System.out.println("Fibonacci Series");
        printFibonacci(numberOfTerms);
    }
    /*
        Method to print fibonacci series upto n terms
     */

    private static void printFibonacci(int numberOfTerms) {
        int a = 0;
        int b = 1;
        int c;
        System.out.print(a + " " + b);
        for (int index = 0; index < numberOfTerms - 2; index++) {
            c = a + b;
            System.out.print(" " + c);
            a = b;
            b = c;
        }
    }
}
