import java.util.Scanner;

public class JavaBasics_Part1_Program4 {
    public static void main(String[] args) {

        int number_1, number_2, number_3;
        Scanner sc = new Scanner(System.in);
        System.out.println("Greatest of three number");
        System.out.println("Enter First Number :");
        number_1 = sc.nextInt();
        System.out.println("Enter Second Number :");
        number_2 = sc.nextInt();
        System.out.println("Enter Third Number :");
        number_3 = sc.nextInt();
        System.out.println("Greatest of three numbers among " + number_1 + " " + number_2 + " and " + number_3 + " is " + getGreaterNumber(number_1, number_2, number_3));

    }

    private static int getGreaterNumber(int number_1, int number_2, int number_3) {
        return (number_1 > number_2) ? ((number_1 > number_3) ? number_1 : ((number_3 > number_2) ? number_3 : number_1)) : number_2;
    }

}
