import java.util.List;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
public class Duplicateelem {
public static void main(String[]args) {

List<String> al = new ArrayList<String>();
al.add("aaa");
al.add("bbb");
al.add("aaa");
al.add(null);
al.add("ccc");
al.add(null);
al.add("ddd");
al.add("ccc");

System.out.println(al);

// Remove duplicate values but order may change
Set<String> hset = new HashSet<String>(al);
System.out.println(hset);

// Remove duplicate values and maintain insertion order
Set<String> set = new LinkedHashSet<String>(al);
System.out.println(set);

}
}