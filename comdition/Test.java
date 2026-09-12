import java.util.Scanner;
public class Test{
public static void main(String[]args){

Calculator c=new Calculator();
Scanner sc=new Scanner(System.in);

System.out.println("enter number 1=");
int num1=sc.nextInt();
System.out.println("e ter number 2=");
int num2=sc.nextInt();

System.out.println("enter your choice 1 for addition/ 2 for subtraction/ 3 for multiplication/ 4 for division/5 for modolous=");
int choice=sc.nextInt();


if(choice==1){
int add=c.Addition(num1,num2);
System.out.println("addition is =" +add);
}
else if(choice==2){
int sub=c.Subtraction(num1,num2);
System.out.println(sub);
}
else if(choice==3){
int multi=c.Multiplication(num1,num2);
System.out.println(multi);
}
else if(choice==4){
int divi=c.Division(num1,num2);
System.out.println(divi);
}
else if(choice==5){
int mod=c.Modolous(num1,num2);
System.out.println(mod);
}
else{
System.out.println("invalid choice");
}

sc.close();


//int add=c.Addition(10,10);
//System.out.println("addition is-" +add);
//int sub=c.Subtraction(10,10);
//System.out.println("subtraction is-" +sub);
//int mul=c.Multiplication(10,10);
//System.out.println("Multiplication is-" +mul);
//int div=c.Divison(10,10);
//System.out.println("Division is-" +div);


}
}