import java.util.List;
import java.util.ArrayList;
public class Highest{
public static void main(String[]args){

List<Integer> al=new ArrayList<Integer>();
al.add(101);
al.add(23);
al.add(999);
al.add(324);
al.add(111);
al.add(777);


int high=0;
for(int i :al){
if(high < i){
high=i;
}
}
System.out.println(high);

}
}