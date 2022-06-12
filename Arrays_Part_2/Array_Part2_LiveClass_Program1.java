public class Array_Part2_LiveClass_Program1 {
    public static void main(String[] args) {

        //Program1
        int[] arrayOfNumberProgram1 = {2, 7, 6, 1, 4, 3};
        System.out.println("Given Array : ");
        for (int element : arrayOfNumberProgram1) {
            System.out.print(element + " ");
        }

        System.out.println("\nTraditional Approach");
        findLeadersInArrayTraditionalApproach(arrayOfNumberProgram1);

        System.out.println("\nOptimal Approach");
        findLeadersInArray(arrayOfNumberProgram1);


    }

    /**
     * Method to find leaders in Array using Traditional Approach
     * Leaders - the elements which do not have any larger element on the right side
     *
     * @param arrayOfNumberProgram1
     */
    private static void findLeadersInArrayTraditionalApproach(int[] arrayOfNumberProgram1) {
        int n = arrayOfNumberProgram1.length;
        boolean isLeader = true;
        System.out.println("Leaders in the given array are : ");
        int k = 0;
        for (int i = 0; i < n; i++) {
            int curr = arrayOfNumberProgram1[i];
            for (int j = i + 1; j < n; j++) {
                if (arrayOfNumberProgram1[j] > curr) {
                    isLeader = false;
                    break;
                }
            }
            if (isLeader)
                System.out.print(arrayOfNumberProgram1[i] + " ");
            isLeader = true;
        }


    }

    /**
     * Method to find leaders in Array using Optimal Approach
     * Leaders - the elements which do not have any larger element on the right side
     *
     * @param arrayOfNumberProgram1
     */
    private static void findLeadersInArray(int[] arrayOfNumberProgram1) {
        int n = arrayOfNumberProgram1.length;
        int[] result = new int[n];
        int largest = Integer.MIN_VALUE;
        int j = 0;
        for (int i = n - 1; i >= 0; i--) {
            if (arrayOfNumberProgram1[i] > largest) {
                largest = arrayOfNumberProgram1[i];
                result[j++] = arrayOfNumberProgram1[i];
            }
        }
        System.out.println("Leaders in the given array are : ");
        for (j = j - 1; j >= 0; j--) {
            System.out.print(result[j] + " ");
        }

    }
}
