class calculator
{
    int a;

    public int add(int n1,  int n2)
    {
        int r = n1 + n2;
        return r;
    }

    // Method overloading
    public int add(int n1,  int n2, int n3)
    {
        int r = n1 + n2 + n3;
        return r;
    }
}

public class Demo
{
    public static void main(String a[])
    {
        int num1 = 8;
        int num2 = 59;
        int num3 = 76;

        // Hai JVM I need a variable of calculator
        calculator calc = new calculator();
        int result = calc.add(num1, num2);
        System.out.println(result);
    }

}