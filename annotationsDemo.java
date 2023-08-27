class T 
{
    public void showTheTime()
    {
        System.out.println("In A show");
    }
}
class S extends T
{
    @Override
    public void showTheTime()
    {
        System.out.println("In B show");
    }
}
public class annotationsDemo 
{
    public static void main(String[] args) {
        S objs = new S();
        objs.showTheTime();
    }
}
