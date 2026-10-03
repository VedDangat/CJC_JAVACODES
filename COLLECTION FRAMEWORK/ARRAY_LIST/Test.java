import java.util.List;
import java.util.ArrayList;

public class Test {
public static void main(String[] args) {

List al = new ArrayList();

al.add(101);
al.add("aaa");
al.add(false);
al.add(90.5f);
al.add(101);

System.out.println(al);

Object object = al.get(0);
System.out.println(object);

int i = (int) al.get(0);
System.out.println(i);

float f = (float) al.get(3);
System.out.println(f);

for (Object obj : al) {
System.out.println(obj);
}

}
}