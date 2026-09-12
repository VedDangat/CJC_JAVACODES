import java.util.Scanner;
public class Positive{

public static void main(String[]args){

Scanner sc=new Scanner(System.in);

System.out.println("Enter the number is it postive or negative or equal to zero--");
int number=sc.nextInt();

if(number>0){
System.out.println("no is positive");
}

else if(number<0){
System.out.println("number is negative");
}

else{
System.out.println("number is nutral");
}

sc.close();

}
}