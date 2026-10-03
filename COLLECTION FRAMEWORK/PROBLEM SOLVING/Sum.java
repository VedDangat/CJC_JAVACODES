import java.util.List;
import java.util.ArrayList;
public class Sum{
public static void main(String[]args){


List<Integer> al = new ArrayList<Integer>();
al.add(101);
al.add(111);
al.add(104);
al.add(112);
al.add(818);
al.add(414);
al.add(333);

int sum=0;
for(int obj: al){
sum=sum+obj;
}
System.out.println("sum of number is=" +sum);

}
}