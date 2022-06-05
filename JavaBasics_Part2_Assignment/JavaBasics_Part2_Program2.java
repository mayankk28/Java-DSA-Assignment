import java.util.Scanner;

public class JavaBasics_Part2_Program2 {
    public static void main(String[] args) {
        int number;
        Scanner sc = new Scanner(System.in);
        System.out.println("Program to print multiplication table of given number");
        System.out.println("Enter the number: ");
        number = sc.nextInt();
        generateMultiplicationTable(number);
    }

    /*
        Method to generate multiplication table of given number upto 10
    */
    private static void generateMultiplicationTable(int number) {
        System.out.println("Multiplication Table of Number " + number);
        for (int index = 1; index <= 10; index++) {
            System.out.println(number + " * " + index + " = " + (number * index));
        }
    }
}
