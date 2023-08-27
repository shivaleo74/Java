
public class inheritance_demo extends advanced_Calc
{
    public static void main (String a[])
    {
        Calc obj = new Calc();

        int r1 = obj.add(5,10);
        int r2 = obj.sub(20,7);

        advanced_Calc aobj = new advanced_Calc();
        int r3 = aobj.mul(5, 5);
        float r4 = aobj.div(20, 2);

        System.out.println(r1 + ", " + r2);
        System.out.println(r3 + ", " + r4);

        veryAdvCalc vobj = new veryAdvCalc();

        double r5 = vobj.power(4, 2);

        System.out.println(r5);
    }
}