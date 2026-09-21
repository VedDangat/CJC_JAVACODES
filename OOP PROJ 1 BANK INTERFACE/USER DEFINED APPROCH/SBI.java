import java.util.*;

public class SBI implements RBI{

Scanner sc=new Scanner(System.in);
Account a=new Account();

public void Createacc(){


System.out.println("enter accno-");
a.setAccno(sc.nextInt());

sc.nextLine();

System.out.println("enter name-");
a.setName(sc.nextLine());

System.out.println("enter mobile no-");
a.setMobno(sc.nextLine());

System.out.println("enter adhar no-");
a.setAdharno(sc.nextLine());

System.out.println("enter gender of person-");
a.setGender(sc.nextLine());

System.out.println("enter age of person-");
a.setAge(sc.nextInt());

}

public void Displayalldetails(){

System.out.println("Account no = "+a.getAccno());
System.out.println("Name = "+a.getName());
System.out.println("Mobile no = "+a.getMobno());
System.out.println("Adhar no = "+a.getAdharno());
System.out.println("Gender = "+a.getGender());
System.out.println("Age = "+a.getAge());

}

public void Depositmoney(){

System.out.println("enter the amount to deposit-");
float amt=sc.nextFloat();

if(amt>0){
a.balance=a.balance+amt;
System.out.println("updated balance="+a.balance);
}
else{
System.out.println("transaction not possible");
}

}

public void Withdrawal(){

System.out.println("enter the amount to withdraw-");
float amtt=sc.nextFloat();

if(amtt>0 && amtt<=a.balance){
a.balance=a.balance-amtt;
System.out.println("updated balance after withdraw="+a.balance);
}
else{
System.out.println("transaction not possible");
}

}

public void Balancecheck(){

System.out.println("current balance in account is-"+a.balance);

}

}