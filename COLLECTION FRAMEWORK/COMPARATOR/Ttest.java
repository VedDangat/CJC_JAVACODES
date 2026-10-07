import java.util.Scanner;
import java.util.*;

public class Ttest{
public static void main(String[]args){

Employee e1=new Employee();
e1.setId(101);
e1.setName("ved");

Employee e2=new Employee();
e2.setId(103);
e2.setName("apple");

Employee e3=new Employee();
e3.setId(100);
e3.setName("mango");

List<Employee> al=new ArrayList<Employee>();
al.add(e1);
al.add(e2);
al.add(e3);

Scanner sc=new Scanner(System.in);

System.out.println("enter 1 to sort by id=  \n enter 2 to sort by name=");
int choice=sc.nextInt();

if(choice==1){
Collections.sort(al,Employee.idComparator);
}
else if(choice==2){
Collections.sort(al,Employee.nameComparator);
}
else{
System.out.println("INVLID CHOICE");
}

System.out.println(al);

sc.close();

}
}