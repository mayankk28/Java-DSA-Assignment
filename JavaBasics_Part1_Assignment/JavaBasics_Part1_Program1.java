import java.util.Scanner;

public class JavaBasics_Part1_Program1 {
    public static void main(String[] args) {
        int number_1, number_2;
        Scanner sc = new Scanner(System.in);
        System.out.println("Product of two Number");
        System.out.println("Enter Number 1: ");
        number_1 = sc.nextInt();
        System.out.println("Enter Number 2: ");
        number_2 = sc.nextInt();
        System.out.println("Product of two number " + number_1 + " and " + number_2 + " is " + product(number_1, number_2));
    }

    private static int product(int number_1, int number_2) {
        return number_1 * number_2;
    }
}
