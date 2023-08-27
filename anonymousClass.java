class x
{
    public void show()
    {
        System.out.println("In X show");
    }
}

public class anonymousClass 
{
    public static void main(String[] args) {
        // Anonymous Innerclass
        x obj = new x()
        {
            public void show()
            {
                System.out.println("In anonymous class show");
            }
        };
        obj.show();
    }
    
}
