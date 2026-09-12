public class A{

int num1=30;   //global variable 

public void addition(){
	int num1=100;	//local variable1
	System.out.println(num1);  //100

	int num2=200;   //local variable2
	System.out.println(num2); //200

	System.out.println("addition =" + (num1+num2));  //300

	num1=1000; //variable 1 value changed 
	System.out.println(num1);   //1000

	System.out.println(this.num1);  // 30

}

public void m1(){
	System.out.println("the global variable is=" +num1);  //30

}


public static void main(String[]args){

	A a=new A();

	a.addition();
	a.m1();
}
}