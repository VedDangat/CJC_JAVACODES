import java.util.List;
import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {

        Student s1 = new Student();
        s1.setRollno(101);
        s1.setName("VED");

        Student s2 = new Student();
        s2.setRollno(102);
        s2.setName("ROHIT");

        List<Student> al = new ArrayList<Student>();

        al.add(s1);
        al.add(s2);

        //System.out.println(al);
    
	for(Student std : al){
	System.out.println(std);
	}
}
}