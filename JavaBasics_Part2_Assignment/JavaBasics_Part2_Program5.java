public class JavaBasics_Part2_Program5 {
    public static void main(String[] args) {
        int[] arrayOfNumber = {0, 1, 1, 0, 1, 0, 0};
        System.out.println("Program to separate 0 on left side and 1 on right side");
        int lengthOfarray = arrayOfNumber.length;

        for(int i=0;i<lengthOfarray;i++)
        {
            if(arrayOfNumber[i] == 1)
            {
                for(int j=lengthOfarray-1;j>i;j--)
                {
                    if(arrayOfNumber[j]==0)
                    {
                        arrayOfNumber[i]=0;
                        arrayOfNumber[j]=1;
                        break;
                    }
                }
            }
        }


        System.out.println("Array after separating 0 and 1");
        for (int element : arrayOfNumber) {
            System.out.print(element + " ");
        }
    }
}
