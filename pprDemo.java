class ppr
{
    //static block
    static{
        System.out.println("in static");
    }

    //instance block
    {
        System.out.println("in instance block");
    }
}

public class pprDemo
{
    public static void main(String[] args) throws ClassNotFoundException {
        
        //if you create a new object, both static and instance blocks from  the call will be executed
        // ppr p = new ppr();

        // Class.forName("ppr"); Static block only be executed
        Class.forName("ppr");
    }
}