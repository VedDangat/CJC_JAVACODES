import java.util.*;

public class Test {
public static void main(String[]args) {

Scanner sc = new Scanner(System.in);

List<Student> al = new ArrayList<Student>();


// 1st Student

Student s = new Student();

System.out.println("DETAILS OF 1ST STUDENT");

System.out.println("Enter rollno of student:");
s.setRollno(sc.nextInt());
sc.nextLine();

System.out.println("Enter name of student:");
s.setName(sc.nextLine());

System.out.println("Enter address of student:");
s.setAddr(sc.nextLine());

System.out.println("Enter mobileno of student:");
s.setMobileno(sc.nextLong());

System.out.println("Enter college fees of student:");
s.setClgfees(sc.nextDouble());

System.out.println("Enter marks of student:");
s.setMarks(sc.nextFloat());
sc.nextLine();

System.out.println("Enter college name of student:");
s.setClgname(sc.nextLine());


// 2nd Student

Student s1 = new Student();

System.out.println("\nDETAILS OF 2ND STUDENT");

System.out.println("Enter rollno of student:");
s1.setRollno(sc.nextInt());
sc.nextLine();

System.out.println("Enter name of student:");
s1.setName(sc.nextLine());

System.out.println("Enter address of student:");
s1.setAddr(sc.nextLine());

System.out.println("Enter mobileno of student:");
s1.setMobileno(sc.nextLong());

System.out.println("Enter college fees of student:");
s1.setClgfees(sc.nextDouble());

System.out.println("Enter marks of student:");
s1.setMarks(sc.nextFloat());
sc.nextLine();

System.out.println("Enter college name of student:");
s1.setClgname(sc.nextLine());


// 3rd Student

Student s2 = new Student();

System.out.println("\nDETAILS OF 3RD STUDENT");

System.out.println("Enter rollno of student:");
s2.setRollno(sc.nextInt());
sc.nextLine();

System.out.println("Enter name of student:");
s2.setName(sc.nextLine());

System.out.println("Enter address of student:");
s2.setAddr(sc.nextLine());

System.out.println("Enter mobileno of student:");
s2.setMobileno(sc.nextLong());

System.out.println("Enter college fees of student:");
s2.setClgfees(sc.nextDouble());

System.out.println("Enter marks of student:");
s2.setMarks(sc.nextFloat());
sc.nextLine();

System.out.println("Enter college name of student:");
s2.setClgname(sc.nextLine());


// Add objects to ArrayList

al.add(s);
al.add(s1);
al.add(s2);


// Using Enhanced For Loop

System.out.println("\nUSING ENHANCED FOR LOOP");

for(Student std : al) {

System.out.println("Roll No: " + std.getRollno());
System.out.println("Name: " + std.getName());
System.out.println("Address: " + std.getAddr());
System.out.println("Mobile No: " + std.getMobileno());
System.out.println("College Fees: " + std.getClgfees());
System.out.println("Marks: " + std.getMarks());
System.out.println("College Name: " + std.getClgname());
System.out.println();

}

sc.close();

}
}