import java.util.ArrayList;
import java.util.List;

public class Ttest {
    public static void main(String[] args) {

        List<Stud> stud = new ArrayList<Stud>();

        stud.add(new Stud(101, "VED", 91.21f));
        stud.add(new Stud(102, "ROHIT", 93.11f));
        stud.add(new Stud(103, "RON", 89.12f));

        for (Stud s : stud) {
            s.Display();
        }
    }
}