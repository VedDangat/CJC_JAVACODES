public class Privfinal{

private static final void m1(){
System.out.println("first");
}

private static final void m1(String name){
System.out.println("second");
}

private static final void m1(int x){
System.out.println("third");
}

public static void main(String[]args){
Privfinal p=new Privfinal();

p.m1();
p.m1("ved");
p.m1(100);

}


}