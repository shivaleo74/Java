import test1.test2;

class mainClass
{
    static private int i = 10;

    public void show()
    {
        System.out.println("In mainClass Show");
    }

    class inClass extends test2
    {
        // Hello h = new Hello();

        public void configs()
        {
            System.out.println("inClass Config");
            System.out.println(i);
            System.out.println(h.numbers);
        }
    }

    // static class inClass
    // {
    //     public void configs()
    //     {
    //         System.out.println("inClass Config");
    //     }
    // }
}


public class innerClass {
    public static void main(String a[])
    {
        mainClass obj = new mainClass();
        obj.show();

        mainClass.inClass obj1 = obj.new inClass();
        obj1.configs();

        // If inner class is static 
        // mainClass.inClass obj2 = new mainClass.inClass();
        // obj2.configs();
        
    }    
}
