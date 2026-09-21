import java.util.*;

public class Test{
public static void main(String[]args){

Scanner sc=new Scanner(System.in);

SBI s=new SBI();
BOM b=new BOM();

while(true){

System.out.println("\n1. SBI");
System.out.println("2. BOM");
System.out.println("3. Exit");

System.out.println("enter your choice-");
int choice=sc.nextInt();

switch(choice){

case 1:

System.out.println("\nSBI BANK");
System.out.println("1. Create Account");
System.out.println("2. Display Details");
System.out.println("3. Deposit Money");
System.out.println("4. Withdraw Money");
System.out.println("5. Check Balance");

System.out.println("enter your choice-");
int ch=sc.nextInt();

switch(ch){

case 1:
s.Createacc();
break;

case 2:
s.Displayalldetails();
break;

case 3:
s.Depositmoney();
break;

case 4:
s.Withdrawal();
break;

case 5:
s.Balancecheck();
break;

default:
System.out.println("Invalid choice");

}

break;

case 2:

System.out.println("\nBOM BANK");
System.out.println("1. Create Account");
System.out.println("2. Display Details");
System.out.println("3. Deposit Money");
System.out.println("4. Withdraw Money");
System.out.println("5. Check Balance");

System.out.println("enter your choice-");
int ch2=sc.nextInt();

switch(ch2){

case 1:
b.Createacc();
break;

case 2:
b.Displayalldetails();
break;

case 3:
b.Depositmoney();
break;

case 4:
b.Withdrawal();
break;

case 5:
b.Balancecheck();
break;

default:
System.out.println("Invalid choice");

}

break;

case 3:

System.out.println("Program ended");
break;

default:

System.out.println("Invalid choice");

}

if(choice==3){
break;
}

}

}
}
