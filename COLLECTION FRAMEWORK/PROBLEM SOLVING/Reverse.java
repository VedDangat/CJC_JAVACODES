import java.util.List;
import java.util.ArrayList;
public class Reverse{
public static void main(String[]args){


List<Integer> al = new ArrayList<Integer>();
al.add(101);
al.add(111);
al.add(104);
al.add(112);
al.add(818);
al.add(414);
al.add(333);

System.out.println("original list=" +al);

System.out.println("after reversed=");
for (int i = al.size() - 1; i >= 0; i--) {
System.out.println(al.get(i));
}


}
}