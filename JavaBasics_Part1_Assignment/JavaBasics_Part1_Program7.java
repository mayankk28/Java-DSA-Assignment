import java.util.Scanner;

public class JavaBasics_Part1_Program7 {
    public static void main(String[] args) {
        int marks;
        Scanner sc = new Scanner(System.in);
        System.out.println("Grade students based on their marks!!");
        System.out.println("Enter student marks:");
        marks = sc.nextInt();
        getStudentGrade(marks);
    }

    private static void getStudentGrade(int marks) {
        if (marks >= 90 && marks <= 100)
            System.out.println("A+");
        else if (marks >= 80 && marks < 90)
            System.out.println("A");
        else if (marks >= 70 && marks < 80)
            System.out.println("B");
        else if (marks >= 60 && marks < 70)
            System.out.println("B-");
        else if (marks >= 50 && marks < 60)
            System.out.println("C");
        else if (marks >= 40 && marks < 50)
            System.out.println("C-");
        else if (marks >= 0 && marks < 40)
            System.out.println("FAIL");
        else System.out.println("Invalid Marks");

    }
}
