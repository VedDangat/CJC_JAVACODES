public class Student implements Comparable<Student>{

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

@Override
public String toString(){
return id+" "+name+" "+marks;
}

@Override
public int compareTo(Student s){
return this.id-s.id;
}

// Sort by name:
// @Override
// public int compareTo(Student s){
// return this.name.compareTo(s.name);
// }

}