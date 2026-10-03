import java.util.List;
import java.util.ArrayList;
public class Newtry{
public static void main(String[]args){

List al=new ArrayList();
al.add("ved");
al.add(101);
al.add("dangat");
al.add('c');
al.add(101);
al.add(false);
al.add("ved");

System.out.println("the object of list is-" +al);

for(Object obj : al){
System.out.println(obj);
}

Object object=al.get(1);
System.out.println(object);

System.out.println();

String name= (String)al.get(0);
System.out.println(name);
String sirname=(String)al.get(2);
System.out.println(sirname);

System.out.println("name of student is=" +name +" " +sirname);

}
}