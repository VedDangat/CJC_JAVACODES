public class Ttestt{
public static void main(String[]args){

try{
String rollno="one";
int i=Integer.parseInt(rollno);
System.out.println(i);
}

catch(NumberFormatException e){
System.out.println(e.getMessage());
e.printStackTrace();
}

finally{
System.out.println("code ended");
}

}
}