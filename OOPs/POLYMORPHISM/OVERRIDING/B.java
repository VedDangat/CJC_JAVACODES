public class B extends A{

@Override  
                //cannot over ride final method of A class remove final the nwe can override that emthod in B class 
            
public void m1(){
System.out.println("its a and b boths m1 method");
}

public static void main(String[]ags){
B b=new B();
b.m1();
}

}