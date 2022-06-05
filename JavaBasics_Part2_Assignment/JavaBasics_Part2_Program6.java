import java.util.Scanner;

public class JavaBasics_Part2_Program6 {
    public static void main(String[] args) {
        int number_1, number_2, number_3;
        Scanner sc = new Scanner(System.in);
        System.out.println("Program to find smallest among three number");
        System.out.println("Enter First Number");
        number_1 = sc.nextInt();
        System.out.println("Enter Second Number");
        number_2 = sc.nextInt();
        System.out.println("Enter Third number");
        number_3 = sc.nextInt();
        System.out.println("Smallest among numbers " + number_1 + " " + number_2 + " and" +
                " " + number_3 + " is " + getSmallestNumber(number_1, number_2, number_3));
    }

    /*
        Method to get smallest number among three numbers
     */

    private static int getSmallestNumber(int number_1, int number_2, int number_3) {

        return (number_1 < number_2) ? ((number_1 < number_3) ? number_1 : ((number_3 < number_2) ? number_3 : number_1)) : number_2;

    }
}
