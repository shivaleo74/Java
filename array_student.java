public class Student
{
    int rollno;
    String name;
    int marks;
}

public class class_student
{
    public static void main(String a[])
    {
        //student object creation
        Student s1 = new Student();
        Student s2 = new Student();
        Student s3 = new Student();

        s1.rollno = 1;
        s1.name = "Bhanu";
        s1.marks = 90;

        s2.rollno = 2;
        s2.name = "Shreyan";
        s2.marks = 80;

        s3.rollno = 3;
        s3.name = "Bhumi";
        s3.marks = 70;

        // create an array
        Student students[] = new Student[3];
        students[0] = s1;
        students[1] = s2;
        students[2] = s3;

        for (int i=0;i<students.length;i++)
        {
            System.out.println(students[i].name + " : " + students[i].marks);
        }
    }
}

