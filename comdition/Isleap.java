import java.time.Year;
import java.util.Scanner;
public class Isleap{

public static void main(String[]args){

Scanner sc=new Scanner(System.in);

System.out.println("enter the year-");
int year=sc.nextInt();

if(Year.isLeap(year)){
System.out.println("it is leap year");
}
else{
System.out.println("it is not leap year");
}
sc.close();

}
}