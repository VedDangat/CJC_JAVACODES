public class Student{

int rollno;
String name;
float marks;
static String college="MIT WPU";

public static void main(String[]args){

Student s= new Student();
System.out.println(s);
System.out.println(s.rollno=101);
System.out.println(s.name="ved");
System.out.println(s.marks=93.80f);
System.out.println(Student.college);

//System.out.println(s.college);


System.out.println("******************");


Student s1= new Student();
System.out.println(s1);
System.out.println(s1.rollno=102);
System.out.println(s1.name="sam");
System.out.println(s1.marks=90.80f);
System.out.println(Student.college);

//System.out.println(s1.college);

}
}