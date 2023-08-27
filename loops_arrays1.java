public class loops_arrays1
{
    public static void main(String a[])
    {
        int nums [][] = new int[3][];   //jagged array

        nums[0]=new int[3];
        nums[1]=new int[4];
        nums[2]=new int[2];

        for (int i=0;i<nums.length;i++)
        {
            for (int j=0;j<nums[i].length;j++)
            {
                // Since Math.random is double we are type casting here
                nums[i][j] = (int)(Math.random()*10);
            }
        }

        // for (int i=0;i<3;i++)
        // {
        //     for (int j=0;j<4;j++)
        //     {
        //         System.out.print(nums[i][j] + " ");
        //     }
        //     System.out.println();
        // }
        System.out.println("--------------------");
        // Enhanced for loop
        for (int n[]: nums)
        {
            for(int m: n)
            {
                System.out.print(m + " ");;
            }
            System.out.println();
        }
    }
}
