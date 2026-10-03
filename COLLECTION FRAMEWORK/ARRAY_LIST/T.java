import java.util.List;
import java.util.ArrayList;

public class T{
public static void main(String[]args){

List al=new ArrayList();
	al.add("ved");
	al.add("ved");
	al.add(111);
	al.add(222);
	al.add(false);
	al.add("120.9f");

	System.out.println(al);

	for(Object obj : al){
	
	System.out.println(obj);
	}

}