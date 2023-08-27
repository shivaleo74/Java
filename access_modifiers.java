import CalcPkg.*;
import java.util.ArrayList;
import java.util.ArrayList;
public class access_modifiers
{
    public static void main(String a[])
    {
        veryAdvCalc obj = new veryAdvCalc();

        System.out.println(obj.power(4,2));
        System.out.println(obj.div( 12,2));
        Ask aobj = new Ask();
        System.out.println(aobj.engMarks());
        
        ArrayList list = new ArrayList<>();
        System.out.println(list);
        int mkrs = aobj.marks + 100;
        System.out.println(mkrs);

    }
}
