import java.util.Scanner;
public class Test{

public static void main(String[]args){

Newstudent s=new Newstudent();
Scanner sc=new Scanner(System.in);

System.out.println("enter the roll no of student-");
int roll=sc.nextInt();
s.rollno=roll;
System.out.println("roll no is-" +s.rollno);

System.out.println("enter name of student-");
String n=sc.next();
s.name=n;
System.out.println("name is-" +s.name);

System.out.println("enter the age of student-");
int ag=sc.nextInt();
s.age=ag;
System.out.println("age is-" +s.age);

System.out.println("enter the address-");
String addr=sc.next();
s.address=addr;
System.out.println("address is-" +s.address);

System.out.println("enter the marks of student-");
float mk=sc.nextFloat();
s.marks=mk;
System.out.println("marks=" +s.marks);

System.out.println("enter monile number-");
long mn=sc.nextLong();
s.mobno=mn;
System.out.println("mobile no-" +s.mobno);

System.out.println("enter fees of student-");
double f=sc.nextDouble();
s.fees=f;
System.out.println("fees -" +s.fees);
}
}