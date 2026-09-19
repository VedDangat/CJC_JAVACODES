import java.util.*;
public class BOM implements RBI{

Scanner sc=new Scanner(System.in);
Account a=new Account();

public void Createacc(){
System.out.println("accno-");
a.setAccno(1002);
System.out.println("name-");
a.setName("SAM");
System.out.println("mobile no-");
a.setMobno("65632433");
System.out.println("adhar no-");
a.setAdharno("D30b21A2");
System.out.println("gender of person-");
a.setGender("male");
System.out.println("age of person-");
a.setAge(25);
}

public void Displayalldetails(){
System.out.println(a.getAccno());
System.out.println(a.getName());
System.out.println(a.getMobno());
System.out.println(a.getAdharno());
System.out.println(a.getGender());
System.out.println(a.getAge());
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