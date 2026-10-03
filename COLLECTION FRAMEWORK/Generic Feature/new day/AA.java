import java.util.List;
import java.util.ArrayList;

public class AA {

    public List<Integer> m1() {
        List<Integer> al = new ArrayList<Integer>();

        al.add(101);
        al.add(102);
        al.add(103);

        return al;
    }

    public List<String> m2() {
        List<String> al = new ArrayList<String>();

        al.add("VED");
        al.add("KISHOR");
        al.add("DANGAT");

        return al;
    }

    public List<Student> m3() {

        Student s1 = new Student();
        s1.rollno = 101;
        s1.name = "sam";

        Student s2 = new Student();
        s2.rollno = 102;
        s2.name = "ram";

        List<Student> stud = new ArrayList<Student>();

        stud.add(s1);
        stud.add(s2);

        return stud;
    }
}