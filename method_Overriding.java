class A
{
    public void show()
    {
        System.out.println("Show from A");
    }

}

class B extends A
{
    // Method overriding 
    public void show()
    {
        System.out.println("Show from B");
    }
}

class method_Overriding
{
    public static void main (String a[])
    {
        B bobj = new B();
        bobj.show();
    }
}