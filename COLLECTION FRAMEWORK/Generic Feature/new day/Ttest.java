import java.util.ArrayList;
import java.util.List;

public class Ttest {

    public static void main(String[] args) {

        AA a = new AA();

        List<Integer> list = a.m1();
        System.out.println(list);

        List<String> name = a.m2();
        System.out.println(name);

        List<Student> stud = a.m3();
        System.out.println(stud);
    }
}