import java.util.*;

public class Test{
public static void main(String[]args){

Student s1=new Student();
s1.setId(103);
s1.setName("Rohit");
s1.setMarks(91.90f);

Student s2=new Student();
s2.setId(101);
s2.setName("Ved");
s2.setMarks(90.11f);

Student s3=new Student();
s3.setId(102);
s3.setName("Sam");
s3.setMarks(81.01f);

List<Student> al=new ArrayList<Student>();
al.add(s1);
al.add(s2);
al.add(s3);

Scanner sc=new Scanner(System.in);

System.out.println("Enter 1 to sort by ID");
System.out.println("Enter 2 to sort by Name");
System.out.println("Enter 3 to sort by Marks");

int choice=sc.nextInt();

if(choice==1){
Collections.sort(al,Student.idComparator);
}
else if(choice==2){
Collections.sort(al,Student.nameComparator);
}
else if(choice==3){
Collections.sort(al,Student.marksComparator);
}
else{
System.out.println("INVALID CHOICE");
}

System.out.println(al);

sc.close();
}
}