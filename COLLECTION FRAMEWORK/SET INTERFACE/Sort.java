import java.util.*;
public class Sort{
public static void main(String[]args){

List<Integer> al=new ArrayList<Integer>();
al.add(4);
al.add(2);
al.add(5);
al.add(1);
al.add(9);
al.add(9);
al.add(1);
al.add(6);
System.out.println(al);

//sort and remove duplicate element 
Set<Integer> set=new TreeSet<Integer>(al);
System.out.println(set);

//sort but not remove duplicate element 
Collections.sort(al);
System.out.println(al);


}
}