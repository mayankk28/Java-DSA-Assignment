public class Array_Part1_Assignment_Program2 {
    public static void main(String[] args) {
        //Program2
        int arrayOfNumberProgram2[] = {2, 1, 4, 3, 8, 0, 6, 7};
        System.out.println("Given Array : ");
        for (int element : arrayOfNumberProgram2) {
            System.out.print(element + " ");
        }
        int thirdLargestElementIndex = getThirdLargestElementInArray(arrayOfNumberProgram2);
        if (thirdLargestElementIndex != -1)
            System.out.println("\nThird largest element in the array is " + arrayOfNumberProgram2[thirdLargestElementIndex] + " at index " + thirdLargestElementIndex);
    }

    /**
     * Method to get Third Largest Element in an array
     *
     * @param arrayOfNumberProgram2
     * @return thirdLargestElementIndex
     */
    private static int getThirdLargestElementInArray(int[] arrayOfNumberProgram2) {
        int n = arrayOfNumberProgram2.length;
        int largestElementIndex = 0;
        int secondLargestElementIndex = -1;
        int thirdLargestElementIndex = -1;

        if (n < 3)
            return -1;
        for (int i = 1; i < n; i++) {
            if (arrayOfNumberProgram2[i] > arrayOfNumberProgram2[largestElementIndex]) {
                thirdLargestElementIndex = secondLargestElementIndex;
                secondLargestElementIndex = largestElementIndex;
                largestElementIndex = i;
            } else if (arrayOfNumberProgram2[i] < arrayOfNumberProgram2[largestElementIndex]) {
                if (secondLargestElementIndex == -1 || arrayOfNumberProgram2[i] > arrayOfNumberProgram2[secondLargestElementIndex]) {
                    thirdLargestElementIndex = secondLargestElementIndex;
                    secondLargestElementIndex = i;
                } else if (arrayOfNumberProgram2[i] < arrayOfNumberProgram2[secondLargestElementIndex]) {
                    if (thirdLargestElementIndex == -1 || arrayOfNumberProgram2[i] > arrayOfNumberProgram2[thirdLargestElementIndex]) {
                        thirdLargestElementIndex = i;
                    }
                }

            }

        }
        return thirdLargestElementIndex;
    }
}
