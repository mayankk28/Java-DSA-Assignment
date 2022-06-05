public class JavaBasics_Part2_Program4 {
    public static void main(String[] args) {
        int[] arrayOfNumber = {2, 6, 8, 10, 16, 20, 24};
        int maxValue, minValue;
        System.out.println("Program to get Minimum and Maximum value of given array");
        maxValue = getMaxValueOfArray(arrayOfNumber, arrayOfNumber.length);
        minValue = getMinValueOfArray(arrayOfNumber, arrayOfNumber.length);
        System.out.println("Minumum Value of given array is " + minValue);
        System.out.println("Minimum Value of given array is " + maxValue);
    }

    /*
       Method to get minimum vale in a given array
     */
    private static int getMinValueOfArray(int[] arrayOfNumber, int length) {
        int min = 999999999;
        for (int element : arrayOfNumber) {
            if (element < min) min = element;
        }
        return min;
    }

    /*
      Method to get Max Value of a given array
     */
    private static int getMaxValueOfArray(int[] arrayOfNumber, int length) {
        int max = -999999999;
        for (int element : arrayOfNumber) {
            if (element > max) max = element;
        }
        return max;
    }
}
