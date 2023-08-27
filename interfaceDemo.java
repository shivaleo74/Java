interface k
{
    void show();
    void config();
}
interface z
{
    void run();
}
class imp implements k, z
{
    public void show() {
        System.out.println("method show");
    }
    public void config() {
        System.out.println("method config");
    }
    public void run() {
        System.out.println("method run...");
    }
    
}

public class interfaceDemo {
    public static void main(String[] args) 
    {
        k obj = new imp();

        obj.show();
        obj.config();

        z obj1 = new imp(); 
        obj1.run();
    }
}
