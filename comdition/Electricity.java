import java.util.Scanner;
public class Electricity{
public static void main(String[]args){

Scanner sc=new Scanner(System.in);

System.ot.println("enter the electircal bill-");
int num=sc.nextInt();

if(num>=0 && num<=100){
System.out.println("bill is 3 rupees");
}
else if(num>=101 && num <=300){
System.out.println("bill is 6 rupees");
}
else if(num>=301 && num<=500){
System.out.println("bill is 8 rupees");
}
else{
int bill=3+6+8;
System.out.println(bill);
}

sc.close();
}
}