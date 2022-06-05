public class JavaBasics_Part2_Program3 {
    public static void main(String[] args) {
        int[] arrayOfNumber = {2, 6, 8, 10, 16, 20, 24};
        int sumOfValues;
        sumOfValues = getSumOfValuesOfArray(arrayOfNumber, arrayOfNumber.length);
        System.out.println("Program to get Sum Of values of an array");
        System.out.println("Sum of values of array is " + sumOfValues);
    }

    /*
     Method to get sum of values of given array
     */
    private static int getSumOfValuesOfArray(int[] arrayOfNumber, int length) {
        int sumOfValues = 0;
        for (int element : arrayOfNumber) {
            sumOfValues += element;
        }
        return sumOfValues;
    }
}
