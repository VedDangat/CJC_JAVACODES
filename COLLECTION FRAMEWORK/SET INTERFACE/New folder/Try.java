import java.util.*;
public class Try{
public static void main(String[]args){

LinkedHashSet<Employee> hs=new LinkedHashSet<Employee>();

Employee e1 = new Employee();
e1.setId(101);
e1.setEname("Ved");
e1.setEsalary(50000);
e1.setAddr("Pune");
e1.setMb(9876543210L);
e1.setDesignation("Developer");
e1.setGender("Male");


Employee e2 = new Employee();
e1.setId(102);
e1.setEname("SAM");
e1.setEsalary(80000);
e1.setAddr("Nashik");
e1.setMb(9876543210L);
e1.setDesignation("Tester");
e1.setGender("Male");


Employee e3 = new Employee();
e1.setId(103);
e1.setEname("Rohit");
e1.setEsalary(40000);
e1.setAddr("Pune");
e1.setMb(9876543210L);
e1.setDesignation("Jr Developer");
e1.setGender("Male");


Employee e4 = new Employee();
e1.setId(104);
e1.setEname("Aastha");
e1.setEsalary(50000);
e1.setAddr("Pune");
e1.setMb(9876543210L);
e1.setDesignation("UIUX");
e1.setGender("Female");


Employee e5 = new Employee();
e1.setId(105);
e1.setEname("Madhura");
e1.setEsalary(30000);
e1.setAddr("Pune");
e1.setMb(9876543210L);
e1.setDesignation("Content Creation");
e1.setGender("Female");


hs.add(e1);
hs.add(e2);
hs.add(e3);
hs.add(e4);
hs.add(e5);


System.out.println("EMPLOYEE DETAILS");

for(Employee e : hs) {

System.out.println("ID: " + e.getId());
System.out.println("Name: " + e.getEname());
System.out.println("Salary: " + e.getEsalary());
System.out.println("Address: " + e.getAddr());
System.out.println("Mobile: " + e.getMb());
System.out.println("Designation: " + e.getDesignation());
System.out.println("Gender: " + e.getGender());

System.out.println();

}

}
}