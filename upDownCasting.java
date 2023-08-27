class AA
{
    public void show1()
    {
        System.out.println("In A Show");
    }
}
class BB extends AA
{
    public void show2()
    {
        System.out.println("In B Show");
    }
}
public class upDownCasting {
    public static void main(String[] args) {
        // UpCasting
        AA obj = (AA) new BB();
        obj.show1();

        // DownCasting
        BB obj1 = (BB) obj;
        obj1.show2();

    }
}
