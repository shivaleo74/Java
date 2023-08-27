class Mobile
{
    String brand;
    int price;
    String name;
    static String type;

    static
    {
        type = "Smartphone"; 
        System.out.println("From static block ");
    }

    //constructor
    public Mobile()
    {
        brand = "";
        name = "phone";
        price = 200;
        System.out.println("From constructor");
    }

    public void show()
    {
        System.out.println(type + " : " +brand + " : " + name + " : " + price);
    }

    public static void show1(Mobile obj)
    {
        System.out.println(obj.type + " : " +obj.brand + " : " + obj.name + " : " + obj.price);
    }
}

class static_methods_demo
{
    public static void main(String a[])
    {
        // Class.forName("Moblie");

        Mobile mb1 = new Mobile();
        mb1.brand = "Samsung";
        mb1.price = 1000;
        mb1.name = "Samsung A22";
        // mb1.type = "Smart Phone";

        Mobile mb2 = new Mobile();
        mb2.brand = "Apple";
        mb2.price = 1200;
        mb2.name = "iPhone 13";

        // Mobile.type = "Casual phone";
        Mobile.show1(mb1);
        mb1.show();
        mb2.show();
    }
}
