import java.util.*;

public class SBI implements RBI{

Scanner sc=new Scanner(System.in);
Account a[]=new Account[10];
int count=0;

public void Createacc(){

if(count>=10){
System.out.println("Maximum 10 accounts can be created");
return;
}

a[count]=new Account();

System.out.println("enter accno-");
a[count].setAccno(sc.nextInt());

sc.nextLine();

System.out.println("enter name-");
a[count].setName(sc.nextLine());

System.out.println("enter mobile no-");
a[count].setMobno(sc.nextLine());

System.out.println("enter adhar no-");
a[count].setAdharno(sc.nextLine());

System.out.println("enter gender of person-");
a[count].setGender(sc.nextLine());

System.out.println("enter age of person-");
a[count].setAge(sc.nextInt());

count++;

System.out.println("Account created successfully");

}

public void Displayalldetails(){

if(count==0){
System.out.println("No accounts available");
return;
}

for(int i=0;i<count;i++){

System.out.println("-------------------------");
System.out.println("Account "+(i+1));
System.out.println("Account no = "+a[i].getAccno());
System.out.println("Name = "+a[i].getName());
System.out.println("Mobile no = "+a[i].getMobno());
System.out.println("Adhar no = "+a[i].getAdharno());
System.out.println("Gender = "+a[i].getGender());
System.out.println("Age = "+a[i].getAge());
System.out.println("Balance = "+a[i].balance);
System.out.println("-------------------------");

}

}

public void Depositmoney(){

System.out.println("enter account number-");
int acc=sc.nextInt();

for(int i=0;i<count;i++){

if(a[i].getAccno()==acc){

System.out.println("enter the amount to deposit-");
float amt=sc.nextFloat();

if(amt>0){
a[i].balance=a[i].balance+amt;
System.out.println("updated balance="+a[i].balance);
}
else{
System.out.println("transaction not possible");
}

return;

}

}

System.out.println("Account not found");

}

public void Withdrawal(){

System.out.println("enter account number-");
int acc=sc.nextInt();

for(int i=0;i<count;i++){

if(a[i].getAccno()==acc){

System.out.println("enter the amount to withdraw-");
float amtt=sc.nextFloat();

if(amtt>0 && amtt<=a[i].balance){
a[i].balance=a[i].balance-amtt;
System.out.println("updated balance after withdraw="+a[i].balance);
}
else{
System.out.println("transaction not possible");
}

return;

}

}

System.out.println("Account not found");

}

public void Balancecheck(){

System.out.println("enter account number-");
int acc=sc.nextInt();

for(int i=0;i<count;i++){

if(a[i].getAccno()==acc){

System.out.println("current balance in account is-"+a[i].balance);
return;

}

}

System.out.println("Account not found");

}

}