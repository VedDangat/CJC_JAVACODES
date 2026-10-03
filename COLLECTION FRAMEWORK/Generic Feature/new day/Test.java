import java.util.List;
import java.util.ArrayList;
public class Test{
public static void main(String[]args){


List<Integer> al1=new ArrayList<Integer>();
al1.add(101);
al1.add(102);
al1.add(103);

List<Integer> al2=new ArrayList<Integer>();
al2.add(104);
al2.add(105);
al2.add(106);

List<List<Integer>> al=new ArrayList<List<Integer>>();
al.add(al1);
al.add(al2);
System.out.println(al);

for(List<Integer> list:al){
for(int i:list){
System.out.println(i);s
}
}

}
}