public class Calculator{

public void Addition(){
int a=20;
int b=30;
int sum=a+b;
System.out.println("the sum=" +sum);
}

public void Addition(int num1,int num2){
System.out.println("addition is=" +(num1+num2));
}

public void Addition(int num1,int num2,int num3){
System.out.println("triple no addition is=" +(num1+num2+num3));
}

public void Addition(int num1,float num2){
System.out.println("casting addition=" +(num1+num2));
}


public static void main(String[]args){

Calculator c=new Calculator();
c.Addition();
c.Addition(12,12);
c.Addition(12,12,12);
c.Addition(12,12.12f);

}
}