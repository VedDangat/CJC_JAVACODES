public class Newtest{
public static void main(String[]args){

try{
int arr[]={1,2,3,4};
System.out.println(arr[10]);

String rollno="one";
int i=Integer.parseInt(rollno);
System.out.println(i);

System.out.println(10/0);
}

catch(ArithmeticException e){
System.out.println(e.getMessage());
}
catch(NullPointerException e){
System.out.println(e.getMessage());
}
catch(Exception e){
System.out.println(e.getMessage());  //will get executed 
}

finally{
System.out.println("Code ended");
}

}
}