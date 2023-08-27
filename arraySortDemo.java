import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Student
{
    int age;
    String name;

    public Student(int age, String name) {
        this.age = age;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student [age=" + age + ", name=" + name + "]";
    }

    // @Override
    // public int compareTo(Student that) {
    //     if(this.age > that.age)
    //         return 1;
    //     else
    //         return -1;
    //     // throw new UnsupportedOperationException("Unimplemented method 'compareTo'");
    // }
}

public class arraySortDemo {
    public static void main(String[] args) {
        // Comparator<Student> com = new Comparator<Student>() 
        Comparator<Student> com = (i, j) -> i.age > j.age?1:-1;
        // {
            // public int compare(Integer i, Integer j) 
            // {
            //     if(i%10 > j%10)
            //         return 1;
            //     else
            //         return -1;

            //     // throw new UnsupportedOperationException("Unimplemented method 'compare'");
            // }

            // public int compare(Student i, Student j) 
            // {
            //     if(i.age > j.age)
            //         return 1;
            //     else
            //         return -1;
            // }
        // };

        List<Student> studs = new ArrayList<>();
        studs.add(new Student(71, "siva"));
        studs.add(new Student(33, "Bungi"));
        studs.add(new Student(54, "Chiku"));
        studs.add(new Student(21, "Mittu"));

        Collections.sort(studs, com);
        for(Student s : studs)
        {
            System.out.println(s);
        }      
    }s
}
