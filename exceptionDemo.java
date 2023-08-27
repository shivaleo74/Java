public class exceptionDemo {
    public static void main(String[] args) {
        int i = 20;
        int j = 0;
        int nums[] = new int[5];
        String str = null;
        str = "Hello";

        try {
            j = 18/i;
            if (j==0)
                throw new ArithmeticException();
            System.out.println(str.length());
            System.out.println(nums[1]);
            System.out.println(nums[5]);

            
        } 
        catch (ArithmeticException e) {
            j = 18/1;
            System.out.println("That is default output");
            // System.out.println("Can not divide by zero");
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Stay in your limits");
        }
        catch(Exception e)
        {
            System.out.println("Something went wrong: " + e);
        }
        System.out.println("value of j is: " + j);
        System.out.println("Execution completed");
    }
}
