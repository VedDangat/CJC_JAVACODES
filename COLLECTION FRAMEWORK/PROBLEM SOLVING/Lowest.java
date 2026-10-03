import java.util.List;
import java.util.ArrayList;
public class Lowest{
public static void main(String[]args){

List<Integer> al=new ArrayList<Integer>();
al.add(101);
al.add(23);
al.add(999);
al.add(324);
al.add(111);
al.add(777);


int low=al.get(0);
for(int i :al){
if(low > i){
low=i;
}
}
System.out.println(low);

}
}