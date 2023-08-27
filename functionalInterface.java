import javax.swing.text.TabExpander;

// SAM Interface/Function Interface : Single Abastract Method Interface
@FunctionalInterface
interface Q
{
    void show();
    // void config();
}
// class R implements Q
// {
//     public void show()
//     {
//         System.out.println("In R show");
//     }
// }
public class functionalInterface {
    public static void main(String[] args) 
    {
        Q objq = new Q()
        {
            public void show()
            {
                System.out.println("In Q show");
            }
        };
        objq.show();
    }
}
