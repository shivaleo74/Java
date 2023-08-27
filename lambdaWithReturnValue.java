// SAM Interface/Function Interface : Single Abastract Method Interface
@FunctionalInterface
interface L
{
    int add(int i, int j);
}

public class lambdaWithReturnValue
{
    public static void main(String args[]) 
    {
        // Lambda expression works only with functional interface
        L objl = (i, j) -> i+j ;

        int result = objl.add(5,7);
        System.out.println(result);
    }    
}
