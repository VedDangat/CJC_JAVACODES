import java.util.Comparator;
public class Employee{

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

public static Comparator<Employee> idComparator=new Comparator<Employee>(){
@Override
public int compare(Employee o1,Employee o2){
return Integer.compare(o1.getId(),o2.getId());
}
};

public static Comparator<Employee> nameComparator=new Comparator<Employee>(){
@Override
public int compare(Employee o1,Employee o2){
return o1.getName().compareTo(o2.getName());
}
};


public String toString(){
return "Id=" +id+ "  " +"Name=" +name;
}


}