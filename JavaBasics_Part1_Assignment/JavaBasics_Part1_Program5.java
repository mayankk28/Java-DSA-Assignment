import java.util.Scanner;

public class JavaBasics_Part1_Program5 {
    public static void main(String[] args) {
        int year;
        Scanner sc = new Scanner(System.in);
        System.out.println("Is Leap Year?");
        System.out.println("Enter a year to check leap year :");
        year = sc.nextInt();
        if (isLeapYear(year))
            System.out.println(year + " is a leap year");
        else
            System.out.println(year + " is not a leap year");

    }

    private static boolean isLeapYear(int year) {
        if (year % 400 == 0) return true;
        if ((year % 4 == 0) && (year % 100 != 0)) return true;
        return false;
    }
}
