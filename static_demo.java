class Mobile
{
    String brand;
    int price;
    String name;
    static String type = "Smartphone";

    public void show()
    {
        System.out.println(type + " : " +brand + " : " + name + " : " + price);
    }
}

class static_demo
{
    public static void main(String a[])
    {
        Mobile mb1 = new Mobile();
        mb1.brand = "Samsung";
        mb1.price = 1000;
        mb1.name = "Samsung A22";
        // mb1.type = "Smart Phone";

        Mobile mb2 = new Mobile();
        mb2.brand = "Apple";
        mb2.price = 1200;
        mb2.name = "iPhone 13";

        Mobile.type = "Casual phone";

        mb1.show();
        mb2.show();
    }
}
