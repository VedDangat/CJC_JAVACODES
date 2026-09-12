import java.util.Scanner;
public class Tables{
public static void main(String[]args){

Scanner sc=new Scanner(System.in);

System.out.println("enter the number");
int num=sc.nextInt();

int res=0;

for(int i=1;i<=10;i++){
	res= num*i;
	System.out.println(res);
}

System.out.println("*****************");
//without using res variable

for(int i=1;i<=10;i++){
System.out.println(num*i);
}


}
}