public class Array_Part1_Assignment_Program4 {
    public static void main(String[] args) {

        //Program4
        int arrayOfNumberProgram4[] = {2, 2, 4, 5, 8, 10, 16, 11};
        System.out.println("Given Array : ");
        for (int element : arrayOfNumberProgram4) {
            System.out.print(element + " ");
        }
        arrayReverse(arrayOfNumberProgram4);
    }

    /**
     * Method to reverse the array
     *
     * @param arrayOfNumberProgram4
     */
    private static void arrayReverse(int[] arrayOfNumberProgram4) {
        int n = arrayOfNumberProgram4.length;
        int temp;
        for (int i = 0; i < n / 2; i++) {
            temp = arrayOfNumberProgram4[i];
            arrayOfNumberProgram4[i] = arrayOfNumberProgram4[n - i - 1];
            arrayOfNumberProgram4[n - i - 1] = temp;
        }
        System.out.println("\nArray after reversing : ");
        for (int element : arrayOfNumberProgram4) {
            System.out.print(element + " ");
        }
    }

}
