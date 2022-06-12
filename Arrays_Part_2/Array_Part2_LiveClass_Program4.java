public class Array_Part2_LiveClass_Program4 {
    public static void main(String[] args) {

        //Program4
        int[] arrayOfNumberProgram4 = {1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1};
        System.out.println("Given Array : ");
        for (int element : arrayOfNumberProgram4) {
            System.out.print(element + " ");
        }

        int trapRainWaterArea = findTrapRainWaterArea(arrayOfNumberProgram4);
        System.out.println("\nMaximum area of trap rain water is " + trapRainWaterArea);
    }

    /**
     * Method to find maximum area of trapped rain water
     *
     * @param arrayOfNumberProgram4
     * @return maxArea
     */
    private static int findTrapRainWaterArea(int[] arrayOfNumberProgram4) {
        int n = arrayOfNumberProgram4.length;
        int l[] = new int[n];
        int r[] = new int[n];
        int res[] = new int[n];
        int maxArea = 0;

        l[0] = arrayOfNumberProgram4[0];
        for (int i = 1; i < n; i++) {
            l[i] = Math.max(l[i - 1], arrayOfNumberProgram4[i]);
        }
        System.out.println("\nL Array:");
        for (int element : l) System.out.print(element + " ");
        r[n - 1] = arrayOfNumberProgram4[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            r[i] = Math.max(r[i + 1], arrayOfNumberProgram4[i]);
        }
        System.out.println("\nR Array:");
        for (int element : r) System.out.print(element + " ");
        for (int i = 0; i < n; i++) {
            res[i] = Math.min(l[i], r[i]) - arrayOfNumberProgram4[i];
        }
        System.out.println("\nRes Array:");
        for (int element : res) System.out.print(element + " ");
        for (int element : res) {
            maxArea += element;
        }

        return maxArea;
    }
}
