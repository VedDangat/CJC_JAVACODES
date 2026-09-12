public class Testsss{
public static void main(String[]args){


Students s=new Students();

s.setId(101);
int id=s.getId();
System.out.println(id);

s.setName("ved");
String name=s.getName();
System.out.println(name);

s.setAddress("Pune");
String addr=s.getAddress();
System.out.println(addr);

s.setMarks(90.9f);
float m=s.getMarks();
System.out.println(m);

}
}