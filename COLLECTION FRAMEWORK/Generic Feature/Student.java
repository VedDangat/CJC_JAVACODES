public class Student {

    private int rollno;
    private String name;

    public void setRollno(int rollno) {
        this.rollno = rollno;
    }

    public int getRollno() {
        return rollno;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Student[rollno=" + rollno + ", name=" + name + "]";
    }
}