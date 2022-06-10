public class ArrayPart_1_LiveClassSolution {
    public static void main(String[] args) {

        //Program1
        int arrayOfNumberProgram1[] = {2, 1, 4, 3, 5, 7, 6, 7};
        int key = 1;
        System.out.println("***************Program1********************\n");
        System.out.println("Given Array : ");
        for (int element : arrayOfNumberProgram1) {
            System.out.print(element + " ");
        }
        System.out.println(" and Key to find: " + key);
        int index = searchAnElementInArray(arrayOfNumberProgram1, key);
        if (index == -1) {
            System.out.println("Element Not Found");
        } else System.out.println("Element Found at index: " + index);

        //Program2
        int arrayOfNumberProgram2[] = {2, 1, 4, 3, 5, 7, 6, 7};
        int itemToDelete = 1;
        System.out.println("\n\n***************Program2********************\n");
        System.out.println("Given Array : ");
        for (int element : arrayOfNumberProgram2) {
            System.out.print(element + " ");
        }
        System.out.println(" and Item to delete: " + itemToDelete);
        deleteAnElementFromArray(arrayOfNumberProgram2, itemToDelete);

        //Program3
        int arrayOfNumberProgram3[] = {2, 1, 4, 3, 5, 7, 6, 7};
        System.out.println("\n\n***************Program3********************\n");
        System.out.println("Given Array : ");
        for (int element : arrayOfNumberProgram3) {
            System.out.print(element + " ");
        }
        int largestIndex = largestElementInAnArray(arrayOfNumberProgram3);
        System.out.println("\nLargest Element is " + arrayOfNumberProgram3[largestIndex] + " at index " + largestIndex);

        //Program4
        int arrayOfNumberProgram4[] = {2, 1, 4, 3, 5, 7, 6, 7};
        System.out.println("\n\n***************Program4********************\n");
        System.out.println("Given Array : ");
        for (int element : arrayOfNumberProgram4) {
            System.out.print(element + " ");
        }
        int secondLargestIndex = secondLargestElementInAnArray(arrayOfNumberProgram4);
        System.out.println("\nSecond Largest Element is " + arrayOfNumberProgram3[secondLargestIndex] + " at index " + secondLargestIndex);

        //Program5
        int arrayOfNumberProgram5[] = {2, 2, 3, 4, 4, 7, 7, 7, 7};
        System.out.println("\n\n***************Program5********************\n");
        System.out.println("Given Array : ");
        for (int element : arrayOfNumberProgram5) {
            System.out.print(element + " ");
        }
        removeDuplicatesFromSortedArray(arrayOfNumberProgram5);
    }


    /**
     * Method to remove duplicates from a Sorted array
     *
     * @param arrayOfNumberProgram5
     */
    private static void removeDuplicatesFromSortedArray(int[] arrayOfNumberProgram5) {
        int j = 0;
        int n = arrayOfNumberProgram5.length;
        for (int i = 0; i < n; i++) {
            if (arrayOfNumberProgram5[i] != arrayOfNumberProgram5[j]) {
                arrayOfNumberProgram5[j + 1] = arrayOfNumberProgram5[i];
                j++;
            }
        }
        System.out.println("\nDisplaying Array after removing duplicates : ");
        for (int element : arrayOfNumberProgram5) {
            System.out.print(element + " ");
        }

    }

    /**
     * Method to find Second Largest Element in an array
     *
     * @param arrayOfNumberProgram4
     * @return secondLargestElementIndex
     */
    private static int secondLargestElementInAnArray(int[] arrayOfNumberProgram4) {
        int largestElementIndex = 0;
        int secondLargestElementIndex = -1;
        int n = arrayOfNumberProgram4.length;

        for (int i = 1; i < n; i++) {
            if (arrayOfNumberProgram4[i] > arrayOfNumberProgram4[largestElementIndex]) {
                secondLargestElementIndex = largestElementIndex;
                largestElementIndex = i;
            } else if (arrayOfNumberProgram4[i] < arrayOfNumberProgram4[largestElementIndex]) {
                if ((secondLargestElementIndex < 0 || arrayOfNumberProgram4[i] > arrayOfNumberProgram4[secondLargestElementIndex])) {
                    secondLargestElementIndex = i;
                }
            }
        }
        return secondLargestElementIndex;
    }

    /**
     * Method to find largest element in an array
     *
     * @param arrayOfNumberProgram3
     * @return largestElementIndex
     */
    private static int largestElementInAnArray(int[] arrayOfNumberProgram3) {
        int max = 0;
        int n = arrayOfNumberProgram3.length;
        for (int i = 0; i < n; i++) {
            if (arrayOfNumberProgram3[i] > arrayOfNumberProgram3[max]) {
                max = i;
            }
        }
        return max;
    }

    /**
     * Method to delete an element from array
     *
     * @param arrayOfNumberProgram2
     * @param itemToDelete
     */
    private static void deleteAnElementFromArray(int[] arrayOfNumberProgram2, int itemToDelete) {
        int n = arrayOfNumberProgram2.length;
        int i;
        for (i = 0; i < n; i++) {
            if (arrayOfNumberProgram2[i] == itemToDelete) break;
        }

        for (int j = i; j < n - 1; j++) {
            arrayOfNumberProgram2[j] = arrayOfNumberProgram2[j + 1];
        }
        System.out.println("Displaying array after deleting element: " + itemToDelete);
        for (int element : arrayOfNumberProgram2) {
            System.out.print(element + " ");
        }
        System.out.println();

    }

    /**
     * Method to search an element in array
     *
     * @param arrayOfNumberProgram1
     * @param key
     * @return index of key found
     */
    private static int searchAnElementInArray(int[] arrayOfNumberProgram1, int key) {
        int n = arrayOfNumberProgram1.length;
        int index = -1;
        for (int i = 0; i < n; i++) {
            if (arrayOfNumberProgram1[i] == key) {
                index = i;
                break;
            }
        }
        return index;
    }
}
