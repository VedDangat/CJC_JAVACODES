public class Employee implements Comparable<Employee>{

private int id;
private String name;

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

@Override
public String toString() {
return id + " " + name;
}

@Override
public int compareTo(Employee e){
return this.id - e.id;
}



}