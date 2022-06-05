import java.util.Scanner;

public class JavaBasics_Part1_Program6 {
    public static void main(String[] args) {
        int number_1, number_2;
        Scanner sc = new Scanner(System.in);
        System.out.println("Swapping of Two Numbers ");
        System.out.println("Enter First Number : ");
        number_1 = sc.nextInt();
        System.out.println("Enter Second Number : ");
        number_2 = sc.nextInt();
        System.out.println("Numbers before Swaping ");
        System.out.println("FirstNumber = " + number_1 + " and SecondNumber = " + number_2);
        System.out.println("Numbers after Swapping ");
        System.out.println("FirstNumber = " + swapTwoNumbers(number_1, number_2) + " and SecondNumber = " + swapTwoNumbers(number_2, number_1));
    }

    private static int swapTwoNumbers(int numberToSwap, int numberSwapBy) {
        return numberToSwap + numberSwapBy - numberToSwap;
    }
}
