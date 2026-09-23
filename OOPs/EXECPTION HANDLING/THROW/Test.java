import java.util.*;
public class Test{
public static void main(String[]args){

Scanner sc=new Scanner(System.in);

System.out.println("enter the number ie age of person-");
int num=sc.nextInt();


if(num<18){
throw new AgeInvalidException("not eligible to vote and licence test also");
}
else{
System.out.println("eligible to vote");
}

sc.close();

}
}