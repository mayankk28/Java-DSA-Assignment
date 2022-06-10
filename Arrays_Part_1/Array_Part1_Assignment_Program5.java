public class Array_Part1_Assignment_Program5 {
    public static void main(String[] args) {

        //Program5
        int arrayOfNumberProgram5[] = {7, 5, 8, 9, 6, 8, 5, 7, 4, 6};
        System.out.println("Given Array : ");
        for (int element : arrayOfNumberProgram5) {
            System.out.print(element + " ");
        }

        replaceElementWithTheGreatestElementOnRightSide(arrayOfNumberProgram5);

    }

    /**
     * Method to replace element with the greatest element on right side of given array.
     *
     * @param arrayOfNumberProgram5
     */
    private static void replaceElementWithTheGreatestElementOnRightSide(int[] arrayOfNumberProgram5) {
        int n = arrayOfNumberProgram5.length;
        int max = 1;
        int temp;
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arrayOfNumberProgram5[j] > arrayOfNumberProgram5[max]) {
                    max = j;
                }
            }
            arrayOfNumberProgram5[i] = arrayOfNumberProgram5[max];
            max = i + 2;
        }
        arrayOfNumberProgram5[n - 1] = 0; //for the last element there are no element on right side
        System.out.println("\nGiven Array after replacing with greatest element on the right : ");
        for (int element : arrayOfNumberProgram5) {
            System.out.print(element + " ");
        }
    }
}
