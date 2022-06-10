public class Array_Part1_Assignment_Program3 {
    public static void main(String[] args) {

        //Program3
        int arrayOfNumberProgram3[] = {2, 2, 4, 5, 8, 10, 16, 11};
        System.out.println("Given Array : ");
        for (int element : arrayOfNumberProgram3) {
            System.out.print(element + " ");
        }

        boolean isArraySorted = checkArraySorted(arrayOfNumberProgram3);
        if (isArraySorted)
            System.out.println("\nGiven Array is sorted");
        else
            System.out.println("\nGiven Array is not sorted");
    }

    /**
     * Method to check if given array is sorted or not
     *
     * @param arrayOfNumberProgram3
     * @return isArraySorted true or false
     */
    private static boolean checkArraySorted(int[] arrayOfNumberProgram3) {
        boolean isArraySorted = true;
        int n = arrayOfNumberProgram3.length;

        for (int i = 0; i < n - 1; i++) {
            if (arrayOfNumberProgram3[i + 1] < arrayOfNumberProgram3[i]) {
                isArraySorted = false;
                break;
            }
        }

        return isArraySorted;
    }
}
