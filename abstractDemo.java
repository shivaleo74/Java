abstract class car
{
    // you can have abstract methods only in abstract class
    public abstract void drive();
    public abstract void fly();
    
    //normal method
    public void playMusic()
    {
        System.out.println("Playing music...");
    }
}

class WagonR extends car    //Concrete class
{
    public void drive()
    {
        System.out.println("Driving...");
    }
    public void fly()
    {
        System.out.println("Flying...");
    }
}

public class abstractDemo 
{
    public static void main(String a[])
    {
        car obj = new WagonR();
        obj.drive();
        obj.playMusic();
        obj.fly();
    }
}
