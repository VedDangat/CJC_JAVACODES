import java.util.List;
import java.util.ArrayList;

public class F{
public static void main(String[]args){

List<Object> al=new ArrayList<>();

al.add(101);
al.add("ved");
al.add(12.21f);
al.add(false);
al.add(101);

for(Object obj : al){
System.out.println(obj);
}

System.out.println("---------");

Object o1=al.get(0);
System.out.println(o1);

String name=(String)al.get(1);
System.out.println(name);


}
}