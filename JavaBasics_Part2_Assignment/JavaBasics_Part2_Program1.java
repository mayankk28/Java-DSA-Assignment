public class JavaBasics_Part2_Program1 {
    public static void main(String[] args) {

        int[] arrayOfNumbers = {2, 4, 9, 6, 8};
        int averageOfArray;
        System.out.println("Numbers greater than the average of numbers in the array");
        averageOfArray = getAverageOfArray(arrayOfNumbers, arrayOfNumbers.length);
        System.out.print("Numbers greater than the average of numbers are: ");
        for (int element : arrayOfNumbers) {
            if (element > averageOfArray) System.out.print(element + " ");
        }
    }

     /*
        Method to get Average of elements in the array
     */
    private static int getAverageOfArray(int[] arrayOfNumbers, int length) {
        int average;
        int sumOfElements = 0;
        for (int index = 0; index < length; index++) {
            sumOfElements += arrayOfNumbers[index];
        }
        average = sumOfElements / length;
        return average;
    }
}
