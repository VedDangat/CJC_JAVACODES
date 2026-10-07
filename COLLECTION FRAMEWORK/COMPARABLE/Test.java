import java.util.*;
//import java.util.Lang;
public class Test{
public static void main(String[]args){

Employee e1=new Employee();
e1.setId(103);
e1.setName("Rohit");

Employee e2=new Employee();
e2.setId(101);
e2.setName("Ved");

Employee e3=new Employee();
e3.setId(102);
e3.setName("Sam");

List<Employee> al=new ArrayList<Employee>();
al.add(e1);
al.add(e2);
al.add(e3);

System.out.println("Befor Sort-" +al);

Collections.sort(al);
for(Employee e: al){
System.out.println(e.getId()+" "+e.getName());
}


}
}