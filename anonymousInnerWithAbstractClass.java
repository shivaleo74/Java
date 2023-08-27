abstract class twoWheeler
{
    public abstract void show();
    public abstract void config();
}

// class  runVehical extends twoWheeler
// {
//     public void show()
//     {
//         System.out.println("In runVehical show");
//     }

//     public void config() {
//         System.out.println("In runVehical config");
//     }
    
// }

public class anonymousInnerWithAbstractClass {
    public static void main(String[] args) 
    {
        // Ananymous InnerClass exending abstract class
        twoWheeler obj = new twoWheeler()
        {
            public void show()
            {
                System.out.println("In runVehical show");
            }
        
            public void config() {
                System.out.println("In runVehical config");
            }
        };
        obj.show();
        obj.config();
    }
    
}
