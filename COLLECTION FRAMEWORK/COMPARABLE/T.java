import java.util.*;

public class T{
public static void main(String[]args){

Student s1=new Student();
s1.setId(102);
s1.setName("SAM");
s1.setMarks(91.90f);

Student s2=new Student();
s2.setId(103);
s2.setName("VED");
s2.setMarks(93.10f);

Student s3=new Student();
s3.setId(101);
s3.setName("SRON");
s3.setMarks(80.20f);

List<Student> al=new ArrayList<Student>();

al.add(s1);
al.add(s2);
al.add(s3);

System.out.println("BEFORE SORTING DATA="+al);

System.out.println();

Collections.sort(al);
System.out.println("AFTER SORTING="+al);

}
}