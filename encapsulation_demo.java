class Human
{
    private String name;
    private int age;

    //default construtor
    public Human()
    {
        name = "John";
        age = 12;
        // System.out.println("From constructor");
    }

    //Pameterized constructor
    public Human(String n, int a)
    {
        name = n;
        age = a;
    }

    public void setName(String n)
    {
        name = n;
    }

    public void setAge(int a)
    {
        age = a;
    }
    public String getName()
    {
            return name;
    }

    public int getAge()
    {
        return age;
    }
}

class encapsulation_demo
{
    public static void main(String a[])
    {
        Human obj = new Human("Ram",60);

        System.out.println(obj.getName() + " : " + obj.getAge());

        obj.setName("Siva");
        obj.setAge(45);

        System.out.println(obj.getName() + " : " + obj.getAge());

    }
}
