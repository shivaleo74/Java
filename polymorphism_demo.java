class A
{
    public void show()
    {
        System.out.println("In A Show");
    }
}

class B extends A
{
    public void show()
    {
        System.out.println("In B Show");
    }
}
class C extends A
{
    public void show()
    {
        System.out.println("In C Show");
    }
}

public class polymorphism_demo 
{
    public static void main(String a[])
    {
        // Dynamic method dispatch
        A obj = new A();
        obj.show();
        
        obj = new B();
        obj.show();
        
        obj = new C();
        obj.show();
    }
}
