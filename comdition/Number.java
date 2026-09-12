import java.util.Scanner;
public class Number{

public static void main(String[]args){

Scanner sc=new Scanner(System.in);

System.out.println("enter the number to check if it is even or odd");
int num=sc.nextInt();

if(num%2==0){
System.out.println("number is even");
}
else{
System.out.println("number is odd");
}

sc.close();

}
}