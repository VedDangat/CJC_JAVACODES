import java.util.Scanner;
public class Palindorme{
public static void main(String[]args){

Scanner sc=new Scanner(System.in);

System.out.println("enter the number-");
int num=sc.nextInt();
int temp=num;

int reverse=0;

while(num!=0){
int lastdigit=num%10;
reverse=reverse*10+lastdigit;
num=num/10;
}

System.out.println(reverse);

if(reverse == temp){
System.out.println("no is palindrome");
}
else{
System.out.println("no is not palindorme");
}

sc.close();
}
}