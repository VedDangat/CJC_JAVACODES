import java.util.Comparator;
public class Student{
private int id;
private String name;
private float marks;

public void setId(int id){
this.id=id;
}
public int getId(){
return id;
}

public void setName(String name){
this.name=name;
}
public String getName(){
return name;
}

public void setMarks(float marks){
this.marks=marks;
}
public float getMarks(){
return marks;
}

public static Comparator<Student> idComparator=new Comparator<Student>(){
@Override
public int compare(Student o1,Student o2){
return Integer.compare(o1.getId(),o2.getId());
}
};

public static Comparator<Student> nameComparator=new Comparator<Student>(){
@Override
public int compare(Student o1,Student o2){
return o1.getName().compareTo(o2.getName());
}
};

public static Comparator<Student> marksComparator=new Comparator<Student>(){
@Override
public int compare(Student o1,Student o2){
return Float.compare(o1.getMarks(),o2.getMarks());
}
};

@Override
public String toString(){
return "ID="+id+"  "+"NAME="+name+"  "+"MARKS="+marks;
}
}