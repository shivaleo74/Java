
enum Laptop{
    Maxbook(2000), XPS(2200), Surface, Thinkpad(1800);

    private int price;

    // Default Constructor
    private Laptop() {
        price = 500;
        System.out.println("Default Constructor : " + this.name());
    }

    // Parameterized Constructor
    private Laptop(int price) {
        this.price = price;
        System.out.println("Parameterized Constructor : " + this.name());
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }    
}
public class enumClassDemo {
    public static void main(String[] args) {
        for (Laptop lap : Laptop.values())
        {
            System.out.println(lap + " : " + lap.getPrice());
        }
    }
}
