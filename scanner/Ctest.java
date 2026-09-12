import java.util.Scanner;
public class Ctest{

public static void main(String[]args){

Calculator c=new Calculator();
Scanner sc=new Scanner(System.in);

//int addres=c.addition(101,111);
//System.out.println(addres);
//int sub=c.subtraction(10,9);
//System.out.println(sub);
//int multi=c.multiplication(10,10);
//System.out.println(multi);
//int divi=c.division(100,10);
//System.out.println(divi);
//int mo=c.modolus(10,10);
//System.out.println(mo);



System.out.println("enter the value of num1=");
int num1=sc.nextInt();

System.out.println("enter the value of num2=");
int num2=sc.nextInt();

System.out.println("enter your choice=1/2/3/4/5 to perform operation=");
int choice=sc.nextInt();

do{
switch(choice){

case 1:
int addres=c.addition(num1,num2);
System.out.println(addres);
break;

case 2:
int sub=c.subtraction(num1,num2);
System.out.println(sub);
break;

case 3:
int multi=c.multiplication(num1,num2);
System.out.println(multi);
break;

case 4:
int divi=c.division(num1,num2);
System.out.println(divi);
break;

case 5:
int mo=c.modolus(num1,num2);
System.out.println(mo);
break;

default:
System.out.println("invalid choice!!!");

}
}while(choice == 5);

}
}