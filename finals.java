
final class calck
{
    // Method constant
    public final void show()
    {
        System.out.println("in Calc Show");
    }
    public void add(int a, int b)
    {
        System.out.println(a+b);
    }
}

class Adv extends calck
{
    public void show()
    {
        System.out.println("advanced");
    }
}

public class finals
{
    public static void main(String[] args) {
        Adv cobj = new Adv();
        cobj.show();
        cobj.add(7, 8);
    }
}