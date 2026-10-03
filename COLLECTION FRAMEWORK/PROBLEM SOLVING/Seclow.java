import java.util.List;
import java.util.ArrayList;
public class Seclow{
public static void main(String[]args){

List<Integer> al=new ArrayList<Integer>();
al.add(101);
al.add(23);
al.add(999);
al.add(324);
al.add(111);
al.add(777);

int low=al.get(0);
int seclow=al.get(0);

for(int i:al){
if(low>i){
seclow=low;
low=i;
}
else if(seclow>i){
seclow=i;
}
}

System.out.println("Lowest = "+low);
System.out.println("Second Lowest = "+seclow);

}
}