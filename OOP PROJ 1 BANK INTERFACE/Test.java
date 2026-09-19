import java.util.*;
public class Test{
public static void main(String[]args){

Scanner sc=new Scanner(System.in);

SBI s=new SBI();
BOM b=new BOM();

do{

System.out.println("enter your choice-");
System.out.println("1. for SBI");
System.out.println("2. for BOM");
int choice=sc.nextInt();

switch(choice){

case 1:
System.out.println("SBI bank selected");
s.Createacc();
s.Displayalldetails();
s.Depositmoney();
s.Withdrawal();
s.Balancecheck();
break;

case 2:
System.out.println("BOM bank selected");
b.Createacc();
b.Displayalldetails();
b.Depositmoney();
b.Withdrawal();
b.Balancecheck();
break;

default:
System.out.println("INVALID CHOICE PROGRAM ENDED");
break;

}

}while(true);

}
}