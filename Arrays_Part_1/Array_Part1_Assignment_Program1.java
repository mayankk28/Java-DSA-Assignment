public class Array_Part1_Assignment_Program1 {

    public static void main(String[] args) {

        //Program1
        int arrayOfNumberProgram1[] = {2, 1, 4, 3, 5, 0, 6, 7};
        System.out.println("Given Array : ");
        for (int element : arrayOfNumberProgram1) {
            System.out.print(element + " ");
        }
        int smallestElementIndex = getSmallestElementOfArray(arrayOfNumberProgram1);
        System.out.println("\nSmallest element in the array is " + arrayOfNumberProgram1[smallestElementIndex] + " at index " + smallestElementIndex);

    }

    /**
     * Method to get smallest element of array
     *
     * @param arrayOfNumberProgram1
     * @return smallestElementIndex
     */
    private static int getSmallestElementOfArray(int[] arrayOfNumberProgram1) {
        int smallestElementIndex = 0;
        int min = arrayOfNumberProgram1[0];
        int n = arrayOfNumberProgram1.length;
        for (int i = 1; i < n; i++) {
            if (arrayOfNumberProgram1[i] < min) {
                min = arrayOfNumberProgram1[i];
                smallestElementIndex = i;
            }
        }
        return smallestElementIndex;
    }
}
