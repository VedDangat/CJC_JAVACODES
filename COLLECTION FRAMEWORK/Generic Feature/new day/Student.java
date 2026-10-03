import java.util.List;
import java.util.ArrayList;

public class Student {

    int rollno;
    String name;

    public String toString() {
        return rollno + " " + name;
    }

    public static void main(String[] args) {

        Student s1 = new Student();
        s1.rollno = 101;
        s1.name = "ved";

        Student s2 = new Student();
        s2.rollno = 102;
        s2.name = "sam";

        Student s3 = new Student();
        s3.rollno = 103;
        s3.name = "ron";

        Student s4 = new Student();
        s4.rollno = 104;
        s4.name = "karan";

        List<Student> al1 = new ArrayList<Student>();
        al1.add(s1);
        al1.add(s2);

        List<Student> al2 = new ArrayList<Student>();
        al2.add(s3);
        al2.add(s4);

        List<List<Student>> al = new ArrayList<List<Student>>();
        al.add(al1);
        al.add(al2);

        System.out.println(al);

        for (List<Student> l : al) {
            for (Student s : l) {
                System.out.println(s);
            }
        }
    }
}