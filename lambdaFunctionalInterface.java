import javax.swing.text.TabExpander;

// SAM Interface/Function Interface : Single Abastract Method Interface
@FunctionalInterface
interface Q
{
    void show(int i);
    // void config();
}
// class R implements Q
// {
//     public void show()
//     {
//         System.out.println("In R show");
//     }
// }
public class lambdaFunctionalInterface {
    public static void main(String[] args) 
    {
        // Lambda expression
        Q objq = i -> System.out.println("In Q show " + i );
        objq.show(5);
    }
}
