public class B extends A{

public B(){
this("aaa");
System.out.println("B constructor");
}

public B(int x){
super();
System.out.println("B int constructor");
}

public B(String y){
this(101);
System.out.println("B string constructor");
}



}