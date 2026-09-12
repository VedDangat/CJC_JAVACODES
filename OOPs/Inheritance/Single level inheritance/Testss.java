public class Testss{
public static void main(String[]args){

//A a=new A();
//System.out.println(a.num1);
//System.out.println(a.num2);
//a.m1();
//a.m2();

//B b=new B();
//System.out.println(b.num1);
//System.out.println(b.num2);
//b.m1();
//b.m2();
//b.m3();



// 1) COMPILER RULE-
A b=new B();
System.out.println(b.num1);

//3) VARIABLE RUNNIG RULE-
// compile time error System.out.println(b.num2);

System.out.println(b.bm);

b.m1(); // 2) METHOD RUNNING RULE-
b.m2();

//compile time error...
//b.m3();

}

}