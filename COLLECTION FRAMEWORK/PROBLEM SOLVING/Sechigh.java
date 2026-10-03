import java.util.List;
import java.util.ArrayList;
public class Sechigh{
public static void main(String[] args){

List<Integer> al=new ArrayList<Integer>();
al.add(101);
al.add(23);
al.add(999);
al.add(324);
al.add(111);
al.add(777);

int high=0;
int sechigh=0;

for(int i:al){
if(high<i){
sechigh=high;
high=i;
}
else if(sechigh<i){
sechigh=i;
}
}

System.out.println("Highest = "+high);
System.out.println("Second Highest = "+sechigh);

}
}