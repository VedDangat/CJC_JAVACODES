import java.util.List;
import java.util.ArrayList;
public class Try{
public static void main(String[]args){


List<Integer> al = new ArrayList<Integer>();
al.add(101);
al.add(111);
//al.add("ved");  string cannot be converte to integer 
al.add(112);

for(int obj: al){
System.out.println(obj);
}

System.out.println();

int num=al.get(1);
System.out.println("individual print=" +num);

System.out.println();

List<String> li=new ArrayList<String>();
li.add("VED");
li.add("KISHOR");
li.add("DANGAT");

for(String name: li){
System.out.println(name);
}

String firstname=li.get(0);
System.out.println("individual print=" +firstname);

}
}