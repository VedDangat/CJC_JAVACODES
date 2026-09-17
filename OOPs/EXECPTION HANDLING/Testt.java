public class Testt{
public static void main(String[]args){

try{
String name=null;
int len=name.length();
System.out.println("length of given string is="+len);
}

catch(NullPointerException e){
System.out.println(e.getMessage());
System.out.println("===================");
e.printStackTrace();
}

finally{
System.out.println("complete code executed hence code ended ");
}

}
}