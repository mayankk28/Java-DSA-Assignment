public class Array_Part2_LiveClass_Program2 {
    public static void main(String[] args) {

        //Program2
        int[] arrayOfNumberProgram2 = {6, -7, 4, -2, 1, 5, -4};
        System.out.println("Given Array : ");
        for (int element : arrayOfNumberProgram2) {
            System.out.print(element + " ");
        }

        int maxSumSubArray = findMaxSumSubArray(arrayOfNumberProgram2);
        System.out.println("\nMaximum Sum of SubArray of given array is " + maxSumSubArray);
    }

    /**
     * Method to find Maximum Sum of sub array of given array
     *
     * @param arrayOfNumberProgram2
     * @return maxSum
     */
    private static int findMaxSumSubArray(int[] arrayOfNumberProgram2) {
        int n = arrayOfNumberProgram2.length;
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            currSum += arrayOfNumberProgram2[i];
            if (currSum < 0) currSum = 0;
            if (currSum > maxSum) maxSum = currSum;
        }
        return maxSum;
    }
}
