import java.util.*;
public class Removeduplicate{
public static void main(String[]args){

List<Integer> al=new ArrayList<Integer>();
al.add(21);
al.add(22);
al.add(22);
al.add(23);
al.add(20);

System.out.println("after sort="+al);


Set<Integer> s=new LinkedHashSet<Integer>(al);
System.out.println("before sort=" +s);

}
}