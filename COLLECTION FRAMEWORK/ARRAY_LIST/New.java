import java.util.List;
import java.util.ArrayList;

public class New{
public static void main(String[]args){

List al=new ArrayList();
	al.add(101);
	al.add(false);
	al.add("ved");
	al.add("soham");
	al.add("12.12f");
	al.add(2424);
	
	for(Object obj : al){
	System.out.println(obj);
	}

	Object obj=al.get(1);
	System.out.println(obj);
	
	boolean b=(boolean)al.get(1);
	System.out.println(b);

	Object o=al.get(4);	
	System.out.println(o);

	float f=(float)al.get(4);
	System.out.println(f);
	

}
}