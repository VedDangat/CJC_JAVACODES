public class AAA{

int x=101;

public void m1(){
System.out.println("this is m1 method");
}

public void Display(){
int num=this.x;
System.out.println(num);
this.m1();
}

public static  void main(String[]args){

AAA a=new AAA();

a.Display();

}
}