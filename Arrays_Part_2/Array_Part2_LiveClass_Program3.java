public class Array_Part2_LiveClass_Program3 {
    public static void main(String[] args) {

        //Program3
        int[] arrayOfNumberProgram3 = {1, 8, 6, 2, 5, 4, 8, 3, 7};
        System.out.println("Given Array : ");
        for (int element : arrayOfNumberProgram3) {
            System.out.print(element + " ");
        }

        int maxArea = findContainerWithMostWater(arrayOfNumberProgram3);
        System.out.println("\nContainer with Most Water is having area : " + maxArea);
    }

    /**
     * Method to find area of container with most water - Two Pointer techniques
     *
     * @param arrayOfNumberProgram3
     * @return maxArea
     */
    private static int findContainerWithMostWater(int[] arrayOfNumberProgram3) {
        int n = arrayOfNumberProgram3.length;
        int maxArea = Integer.MIN_VALUE;
        int l = 0;
        int r = n - 1;
        while (l < r) {
            int area = Math.min(arrayOfNumberProgram3[l], arrayOfNumberProgram3[r]) * (r - l);
            if (area > maxArea) maxArea = area;
            if (l < r) l++;
            else r--;
        }
        return maxArea;
    }
}
