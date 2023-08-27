interface Computer
{
    void code();
}

class Laptop implements Computer
{
    public void code()
    {
        System.out.println("Code : Compile : Run...");
    }
}
class Desktop implements Computer
{
    public void code()
    {
        System.out.println("Code : Compile : Run : Faster...");
    }
}
class Developer 
{
    public void devApp(Computer com)
    {
        com.code();
    }
}

public class looseCouplingIntf {
    public static void main(String[] args) {
        Computer lap = new Laptop();
        Computer desk = new Desktop();

        Developer Siva = new Developer();
        Siva.devApp(desk);
        Siva.devApp(lap);
    }
}
