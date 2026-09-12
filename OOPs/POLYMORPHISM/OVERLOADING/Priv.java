public class Priv{

private static final void m1(){
System.out.println("this is m1");
}

private static final void m1(int x){
System.out.println("this is m1 for int");
}

private static final void m1(String name){
System.out.println("this is m1 for String");
}


public static void main(String[]args){

Priv p=new Priv();
p.m1();
p.m1(101);
p.m1("ved");

}
}