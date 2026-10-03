public class Stud {

    int rollno;
    String name;
    float marks;

    Stud(int rollno, String name, float marks) {
        this.rollno = rollno;
        this.name = name;
        this.marks = marks;
    }

    public void Display() {
        System.out.println(
            "Student[rollno=" + rollno +
            ", name=" + name +
            ", marks=" + marks + "]"
        );
    }
}