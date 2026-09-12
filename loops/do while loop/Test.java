import java.util.Scanner;
public class Test{
public static void main(String[]args){

Scanner sc=new Scanner(System.in);

Calculator c =new Calculator();

do{

System.out.println("enter the value of num1=");
int num1=sc.nextInt();

System.out.println("enter the value of num2=");
int num2=sc.nextInt();

System.out.println("enter you choice- 1 for addition and /2 for subtraction /3 for multiplication /4 for division-");
int choice=sc.nextInt();

if(choice==1)
{
int add=c.Addition(num1,num2);
System.out.println(add);
}

else if(choice==2){
int sub=c.Subtraction(num1,num2);
System.out.println(sub);
}

else if(choice==3){
int mul=c.Multiplication(num1,num2);
System.out.println(mul);
}

else if(choice==4){
int div=c.Division(num1,num2);
System.out.println(div);
}

else{
System.out.println("invalid choice");
}

}while(true);

}
}