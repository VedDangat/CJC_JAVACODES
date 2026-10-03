import java.util.List;
import java.util.ArrayList;
public class Evenodd{
public static void main(String[]args){


List<Integer> al = new ArrayList<Integer>();
al.add(101);
al.add(111);
al.add(104);
al.add(112);
al.add(818);
al.add(414);
al.add(333);

for(int obj: al){
if(obj%2==0){
System.out.println(obj);
}
}

}
}