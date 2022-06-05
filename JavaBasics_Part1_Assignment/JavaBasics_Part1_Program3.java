import java.util.Scanner;

public class JavaBasics_Part1_Program3 {
    private static float INCH_TO_METER = 0.0254f;

    public static void main(String[] args) {
        float inch;
        Scanner sc = new Scanner(System.in);
        System.out.println("Program to convert Inch to Meter");
        System.out.println("Enter inch to convert in meter");
        inch = sc.nextFloat();
        System.out.printf(inch + " is equal to %.2f Meter",getInchToMeter(inch));
    }

    private static float getInchToMeter(float inch) {
        return INCH_TO_METER * inch;
    }
}
