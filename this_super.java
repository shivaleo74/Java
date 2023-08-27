class A
{
    public A()
    {
        System.out.println("From A");
    }

    public A(int n)
    {
        System.out.println("From A int");
    }
}

class B extends A
{
    public B()
    {
        super();
        System.out.println("From B");
    }

    public B(int n)
    {
        // super(n);
        this();
        System.out.println("From B int");
    }
}

public class this_super
{
    public static void main (String a[])
    {
        B aa = new B(5);
    }
}