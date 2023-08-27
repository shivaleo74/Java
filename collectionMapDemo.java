import java.security.Key;
import java.util.HashMap;
import java.util.Map;

public class collectionMapDemo {
    public static void main(String[] args) {
        
        Map<String, Integer> students = new HashMap<>();

        students.put("Siva", 56);
        students.put("Bhanu", 65);
        students.put("Chiku", 77);
        students.put("Mittu", 99);
        students.put("Siva", 23);

        
        System.out.println(students);
        System.out.println(students.get("Siva"));
        System.out.println("Size of Set: " + students.size());
        System.out.println("------------------------------------------------");
        
        for(String key : students.keySet())
        {
            System.out.println(key + " : " + students.get(key));
        }
        
    }
}
