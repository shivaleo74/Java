public class string_demo
{
    public static void main (String a[])
    {
        // String name = new String("Siva");
        // // String name = "Ram";

        // System.out.println("Hello " + name);
        // System.out.println("Char 3 in 'Siva' is " + name.charAt(3));
        // System.out.println("Length of 'Siva' is " + name.length());

        //StringBuffer is ThreadSafe and StringBuilder is not ThreadSave
        StringBuffer sb = new StringBuffer("Sivakumar ");
        System.out.println(sb);
        System.out.println("String capacity is :" + sb.capacity());
        System.out.println(sb.append("Akella"));
        System.out.println("String capacity is :" + sb.capacity());
        sb.deleteCharAt(3);
        sb.insert(0, "AWS Pro: ");
        System.out.println(sb);
    }
}