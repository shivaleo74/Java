import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.Iterator;

public class collectionInterfaceDemo {
    public static void main(String[] args) {
        // List<Integer> nums = new ArrayList<Integer>();

        // nums.add(6);
        // nums.add(7);
        // nums.add(9);
        // nums.add(4);
        // nums.add(3);

        // for(int n : nums)
        // {
        //     System.out.println(n);
        // }
        // for (Object n : nums){
        //     int num = (Integer)n;
        //     System.out.println(num);
        // }
        // Set will not sort elements
        // Set<Integer> nums = new HashSet<Integer>();
        
        //Tree Set to  sort elements
        // Set<Integer> nums = new TreeSet<Integer>();
        // OR
        Collection<Integer> nums = new TreeSet<Integer>();

        nums.add(6);
        nums.add(7);
        nums.add(9);
        nums.add(4);
        nums.add(3);

        
        // for (int n : nums){
        //     System.out.println(n);
        // }

        Iterator<Integer> values = nums.iterator();
        
        while(values.hasNext())
        {
            System.out.println(values.next());
        }
    }
}
