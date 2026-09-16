import java.util.*;
public class Test{
public static void main(String[]args){

Scanner sc=new Scanner(System.in);

System.out.println("etner the number-");
int num=sc.nextInt();

try{
int result=(10/num);
System.out.println("division is="+result);
}

catch(ArithmeticException e){
System.out.println("the zero divison is not possible");
}

finally{
System.out.println("final block executed");
}

}
}